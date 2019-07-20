package com.bankmandiri.edc.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bankmandiri.edc.R
import kotlinx.android.synthetic.main.activity_edc_input.*

class EdcInputActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edc_input)


        btn_next.setOnClickListener {
            startActivity(Intent(this, ShowQRActivity::class.java))
        }
    }

}
