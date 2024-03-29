package com.bankmandiri.edc.view.register


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.bankmandiri.edc.R
import com.bankmandiri.edc.view.RegisterActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RegisterFormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register_form, container, false)


        val btnNext = view.findViewById<Button>(R.id.btn_next)

        btnNext.setOnClickListener {
            val activity = activity
            if (activity is RegisterActivity) {
                val parentActivity = activity as RegisterActivity?
                parentActivity!!.openFragment(RegisterKYCFragment(),4)
            }
        }

        return view
    }


}
