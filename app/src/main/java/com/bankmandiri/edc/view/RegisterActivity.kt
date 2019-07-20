package com.bankmandiri.edc.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.bankmandiri.edc.R
import com.bankmandiri.edc.view.register.RegisterInitiateFragment
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        openFragment(RegisterInitiateFragment())

    }

    fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.layout, fragment)
            .addToBackStack(null)
            .commit()
    }

    fun openFragment(fragment: Fragment, position: Int) {
        openFragment(fragment)

        if(position==2) {
            circle_2.background = resources.getDrawable(R.drawable.circle_orange)
        } else if(position==3) {
            circle_3.background = resources.getDrawable(R.drawable.circle_orange)
        } else if(position==4) {
            circle_4.background = resources.getDrawable(R.drawable.circle_orange)
        }
    }

    companion object{


    }




}
