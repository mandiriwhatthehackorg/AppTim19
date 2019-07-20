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
            val amount = tv_amount.text.toString()
            val intent = Intent(this, ShowQRActivity::class.java)
            intent.apply {
                putExtra("amount", amount)
            }
            startActivity(intent)
        }

        handleInput()
    }

    private fun handleInput() {
        menu0.setOnClickListener {
            handleMenu("0")
        }
        menu1.setOnClickListener {
            handleMenu("1")
        }
        menu2.setOnClickListener {
            handleMenu("2")
        }
        menu3.setOnClickListener {
            handleMenu("3")
        }
        menu4.setOnClickListener {
            handleMenu("4")
        }
        menu5.setOnClickListener {
            handleMenu("5")
        }
        menu6.setOnClickListener {
            handleMenu("6")
        }
        menu7.setOnClickListener {
            handleMenu("7")
        }
        menu8.setOnClickListener {
            handleMenu("8")
        }
        menu9.setOnClickListener {
            handleMenu("9")
        }
    }

    private fun handleMenu(s: String) {

        tv_amount.text = tv_amount.text.toString()+s

    }

}
