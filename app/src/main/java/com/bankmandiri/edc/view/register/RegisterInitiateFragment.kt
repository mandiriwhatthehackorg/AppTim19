package com.bankmandiri.edc.view.register


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.bankmandiri.edc.R
import com.bankmandiri.edc.model.register.RegisterInitiateRequest
import com.bankmandiri.edc.service.ApiService
import com.bankmandiri.edc.util.Constant
import com.bankmandiri.edc.view.RegisterActivity
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_register_initiate.et_email
import kotlinx.android.synthetic.main.activity_register_initiate.et_hp
import kotlinx.android.synthetic.main.activity_register_initiate.et_ktp
import kotlinx.android.synthetic.main.fragment_register_initiate.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RegisterInitiateFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register_initiate, container, false)

        val btnNext = view.findViewById<Button>(R.id.btn_next)

        btnNext.setOnClickListener {
            postData()
        }

        return view
    }

    @SuppressLint("CheckResult")
    fun postData() {

        val apiService = ApiService.create(activity!!.applicationContext)


        var data = RegisterInitiateRequest()
        data.email = et_email.text.toString()
        data.phone = et_hp.text.toString()
        data.nik = et_ktp.text.toString()
        data.ttl = et_dob.text.toString()


        apiService
            .postRegisterInitiate(data)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    result ->

                Log.e(Constant.TAG, Gson().toJson(result.body()))

                val response = result.body()

                val token = response?.data?.token ?: ""

                val activity = activity
                if (activity is RegisterActivity) {
                    val parentActivity = activity as RegisterActivity?
                    var fragment = RegisterOTPFragment()
                    parentActivity!!.openFragment(RegisterOTPFragment.newInstance(token),2)
                }
            },
                { error ->
                    Log.e(Constant.TAG, Gson().toJson(error))
                    Log.e(Constant.TAG, error.message)
                }
            )


    }


}
