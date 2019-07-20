package com.bankmandiri.edc.view.register


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.bankmandiri.edc.R
import com.bankmandiri.edc.model.register.RegisterOTPRequest
import com.bankmandiri.edc.service.ApiService
import com.bankmandiri.edc.util.Constant
import com.bankmandiri.edc.view.RegisterActivity
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RegisterOTPFragment : Fragment() {

    var token = ""
    lateinit var etOtp: EditText

    companion object {

        fun newInstance(token: String): RegisterOTPFragment {
            val fragment = RegisterOTPFragment()
            val bundle = Bundle()
            bundle.putString("token", token)
            fragment.arguments = bundle
            return fragment
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register_otp, container, false)


        val btnNext = view.findViewById<Button>(R.id.btn_next)

        etOtp = view.findViewById(R.id.et_otp)

        btnNext.setOnClickListener {
           postData()
        }

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments
        token = bundle?.getString("token") ?: ""
    }

    @SuppressLint("CheckResult")
    fun postData() {

        val apiService = ApiService.create(activity!!.applicationContext)


        var data = RegisterOTPRequest()
        data.otp = etOtp.text.toString()


        apiService
            .postValidateOTP("Bearer "+token, data)
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
                    parentActivity!!.openFragment(RegisterFormFragment(),3)
                }
            },
                { error ->
                    Log.e(Constant.TAG, Gson().toJson(error))
                    Log.e(Constant.TAG, error.message)
                }
            )


    }




}
