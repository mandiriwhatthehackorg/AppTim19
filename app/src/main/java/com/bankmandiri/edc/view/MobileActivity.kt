package com.bankmandiri.edc.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bankmandiri.edc.R
import com.bankmandiri.edc.service.ApiService
import com.bankmandiri.edc.util.Constant
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_transfer.*

class MobileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_next.setOnClickListener {
            finish()
        }


    }

    @SuppressLint("CheckResult")
    fun getToken() {

        val apiService = ApiService.createOpenshift(this)
        apiService
            .getTokenData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    result ->

                Log.e(Constant.TAG, Gson().toJson(result.body()))

                val response = result.body()

                Toast.makeText(this, "Transaksi Pembelian Pulsa, Sukses!", Toast.LENGTH_LONG).show()

                finish()
            },
                { error ->
                    Log.e(Constant.TAG, Gson().toJson(error))
                    Log.e(Constant.TAG, error.message)
                }
            )


    }


}
