package com.omelchenkoaleks.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onStart() {
        super.onStart()
        next_button_first_fragment.setOnClickListener {
            (activity as MainActivity).navigationController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}
