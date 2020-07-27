package com.omelchenkoaleks.mvvm

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {

    private val getData = GetData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
            мы может передать экземплят getData, потому что класс реализует
            интерфейс LifecycleObserver
         */
        lifecycle.addObserver(getData)
    }
}
