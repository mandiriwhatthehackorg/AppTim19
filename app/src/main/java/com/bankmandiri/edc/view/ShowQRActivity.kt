package com.bankmandiri.edc.view

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bankmandiri.edc.R
import com.bankmandiri.edc.util.Constant
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.journeyapps.barcodescanner.BarcodeEncoder
import kotlinx.android.synthetic.main.activity_qr_show.*

class ShowQRActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_show)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val amount = intent.getStringExtra("amount")

        tv_amount.text = "Jumlah: ${amount}"

        generateQr(amount, img_qr)

        img_qr.setOnClickListener {

        }

    }

    private fun generateQr(s: String, imgQr: ImageView) {
        val multiFormatWriter = MultiFormatWriter()
        try {
            val bitMatrix = multiFormatWriter.encode(s, BarcodeFormat.QR_CODE, 350, 350)
            val barcodeEncoder = BarcodeEncoder()
            val bitmap = barcodeEncoder.createBitmap(bitMatrix)
            imgQr.setImageBitmap(bitmap)
        } catch (e: WriterException) {
            Log.e(Constant.TAG, e.message+" - ")
        }
    }

}
