package com.bankmandiri.edc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.bankmandiri.edc.service.ApiService
import com.bankmandiri.edc.util.Constant
import com.bankmandiri.edc.view.CashWithdrawActivity
import com.bankmandiri.edc.view.EdcInputActivity
import com.bankmandiri.edc.view.LoanActivity
import com.bankmandiri.edc.view.TransferActivity
import com.google.android.material.navigation.NavigationView
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.content_main.*
import java.math.BigInteger
import java.text.NumberFormat

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var token = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
        */

        getToken()

        menu_qr.setOnClickListener {
            startActivity(Intent(this, EdcInputActivity::class.java))
        }

        menu_withdraw.setOnClickListener {
            startActivity(Intent(this, CashWithdrawActivity::class.java))
        }

        menu_transfer.setOnClickListener {
            startActivity(Intent(this, TransferActivity::class.java))
        }

        menu_loan.setOnClickListener {
            startActivity(Intent(this, LoanActivity::class.java))
        }

    }



    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
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
                token = response?.jwt.toString()
                getBalance()
            },
                { error ->
                    Log.e(Constant.TAG, Gson().toJson(error))
                    Log.e(Constant.TAG, error.message)
                }
            )


    }

    @SuppressLint("CheckResult")
    fun getBalance() {

        val apiService = ApiService.create(this)


        apiService
            .getBalance("Bearer ${token}")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    result ->

                Log.e(Constant.TAG, Gson().toJson(result.body()))

                val response = result.body()
                val balance= response?.response?.balance?.balanceInfo?.ledgerBalance.toString().split(".")[0] ?: "0"

                tv_balance.setText(formatMoney(balance))
                tv_norek.text = "No. Rekening: ${response?.response?.balance?.accountNumber}"
            },
                { error ->
                    Log.e(Constant.TAG, Gson().toJson(error))
                    Log.e(Constant.TAG, error.message)
                }
            )


    }

    private fun formatMoney(balance: String): String {


        return NumberFormat.getInstance().format(BigInteger(balance))
    }


}
