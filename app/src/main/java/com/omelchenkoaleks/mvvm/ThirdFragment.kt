package com.omelchenkoaleks.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onStart() {
        super.onStart()
        back_button_third_fragment.setOnClickListener {
            (activity as MainActivity).navigationController.navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }

}