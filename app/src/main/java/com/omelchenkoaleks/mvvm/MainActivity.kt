package com.omelchenkoaleks.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myViewModel =
            ViewModelProvider(this, MyFactory(application, "Factory"))
                .get(MyViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()
        myViewModel.liveData.observe(this, Observer {
            test_text_view.text = it
        })
    }

}