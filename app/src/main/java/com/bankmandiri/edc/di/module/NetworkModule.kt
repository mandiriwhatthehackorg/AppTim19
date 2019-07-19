package com.bankmandiri.edc.di.module

import android.app.Application
import androidx.annotation.NonNull
import com.bankmandiri.edc.BuildConfig
import com.bankmandiri.edc.service.ApiService
import com.bankmandiri.edc.service.DbServices
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {


    @Provides
    @Singleton
    fun provideHttpClient(@NonNull application: Application): OkHttpClient {

       val dbServices = DbServices(application.applicationContext)
        val user = dbServices.user
       val token = user.apiToken.toString()

        return OkHttpClient.Builder()
            .addInterceptor { chain ->
                val original = chain.request()
                val request = original.newBuilder()
                    .addHeader("Authorization", String.format("Bearer %s", token))
                    .method(original.method(), original.body())
                    .build()

                val response = chain.proceed(request)

                response
            }
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
    }



    @Provides
    @Singleton
    fun provideRetrofit(@NonNull okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BuildConfig.SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    @Provides
    @Singleton
    fun provideApiService(@NonNull retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

}