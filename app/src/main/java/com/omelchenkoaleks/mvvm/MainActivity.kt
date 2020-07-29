package com.omelchenkoaleks.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val liveDataStringOne = MutableLiveData<String>()
    val liveDataStringTwo = MutableLiveData<String>()
    val mediatorLiveData = MediatorLiveData<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveDataStringOne.value = "One"
        liveDataStringTwo.value = "Two"

        mediatorLiveData.addSource(liveDataStringOne) {
            text_one_for_liveData.text = it
        }

        mediatorLiveData.addSource(liveDataStringTwo) {
            text_two_for_liveData.text = it
        }

        mediatorLiveData.observe(this, Observer {  })

        button_one_for_liveData.setOnClickListener {
            liveDataStringOne.value = edit_text_for_liveData.text.toString()
        }

        button_two_for_liveData.setOnClickListener {
            liveDataStringTwo.value = edit_text_for_liveData.text.toString()
        }
    }

}