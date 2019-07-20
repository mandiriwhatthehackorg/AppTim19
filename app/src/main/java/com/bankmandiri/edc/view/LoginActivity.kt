package com.bankmandiri.edc.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bankmandiri.edc.MainActivity
import com.bankmandiri.edc.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.hide()


        btn_login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        tv_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }

}
