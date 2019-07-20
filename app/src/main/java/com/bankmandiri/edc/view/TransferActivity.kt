package com.bankmandiri.edc.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bankmandiri.edc.R
import com.bankmandiri.edc.model.transfer.Request
import com.bankmandiri.edc.model.transfer.TransferRequest
import com.bankmandiri.edc.service.ApiService
import com.bankmandiri.edc.util.Constant
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_transfer.*

class TransferActivity : AppCompatActivity() {


    var token = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_next.setOnClickListener {
            getToken()
        }


    }

    @SuppressLint("CheckResult")
    fun getToken() {

        progress.visibility = View.VISIBLE

        val apiService = ApiService.createOpenshift(this)
        apiService
            .getTokenData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    result ->

                Log.e(Constant.TAG, Gson().toJson(result.body()))

                val response = result.body()
                token = response?.jwt.toString()

                progress.visibility = View.GONE

                postTransfer()
            },
                { error ->
                    Log.e(Constant.TAG, Gson().toJson(error))
                    Log.e(Constant.TAG, error.message)

                    progress.visibility = View.GONE
                }
            )


    }

    @SuppressLint("CheckResult")
    private fun postTransfer() {

        progress.visibility = View.VISIBLE

        var trfRequest = TransferRequest()
        var request = Request()
        request.amount = et_amount.text.toString()
        request.transactionID = "00000011"
        request.transactionDate = "2018-09-10"
        request.referenceID = "Order/2018/001"
        request.sourceAccountNumber = "1111006406037"
        request.beneficiaryAccountNumber = et_no.text.toString()
        request.currency = "IDR"
        request.sourceAccountCustType = "1"
        request.beneficiaryCustType = "1"
        request.remark1 = et_remark.text.toString()

        trfRequest.request = request

        val apiService = ApiService.create(this)
        apiService
            .postTransfer(token, trfRequest)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    result ->

                progress.visibility = View.GONE

                Log.e(Constant.TAG, Gson().toJson(result.body()))

                Toast.makeText(this, "Transfer Sukses!", Toast.LENGTH_LONG).show()
                finish()

            },
                { error ->

                    progress.visibility = View.GONE

                    Log.e(Constant.TAG, Gson().toJson(error))
                    Log.e(Constant.TAG, error.message)
                }
            )
    }

}
