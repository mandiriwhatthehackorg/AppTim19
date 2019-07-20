package com.bankmandiri.edc.service

import android.content.Context
import com.bankmandiri.edc.BuildConfig
import com.bankmandiri.edc.model.TokenResponse
import com.bankmandiri.edc.model.balance.BalanceResponse
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiService {


    @Headers("Accept: application/json")
    @GET("rest/pub/apigateway/jwt/getJsonWebToken?app_id=c3590064-bfef-4784-b87b-7459f02f8aec")
    fun getToken(@Header("Authorization") credentials: String): Single<Response<TokenResponse>>

    @Headers("Accept: application/json")
    @GET("gateway/ServicingAPI/1.0/customer/casa/1111006406037/balance")
    fun getBalance(@Header("Authorization") credentials: String): Single<Response<BalanceResponse>>


    companion object {
        fun create(ctx: Context): ApiService {


            val dbServices = DbServices(ctx)
            val token = dbServices.findToken()

            val client = OkHttpClient.Builder()
               .build()

            val retrofit = Retrofit.Builder()
                .client(client)
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.create())
                .addConverterFactory(
                    GsonConverterFactory.create())
                .baseUrl(BuildConfig.SERVER_URL)
                .build()

            return retrofit.create(ApiService::class.java)
        }


    }


}