package com.omelchenkoaleks.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var liveDataString = MutableLiveData<String>()
    var liveDataInt = MutableLiveData<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveDataString.value = "String"
        liveDataInt.value = 10_000


        text_string_for_liveData.text = liveDataString.value
        text_int_for_liveData.text = liveDataInt.value.toString()

        button_for_liveData.setOnClickListener {
            liveDataString = Transformations.map(liveDataInt) {
                it.toString()
            } as MutableLiveData<String>

            liveDataString.observe(this, Observer {
                text_string_for_liveData.text = it
            })
        }
    }

}