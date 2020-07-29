package com.omelchenkoaleks.mvvm

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Lifecycle :
//    private val getData = GetData()

    var liveDataString = MutableLiveData<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveDataString.value = "Hello LiveData!"
        text_for_liveData.text = liveDataString.value






        // ----- Lifecycle : -----

        /*
            мы может передать экземплят getData, потому что класс реализует
            интерфейс LifecycleObserver
         */
//        lifecycle.addObserver(getData)
//        if (lifecycle.currentState == Lifecycle.State.INITIALIZED) {
//            Log.d("TAG", "INITIALIZED")
//            text.text = "INITIALIZED"
//            println("INITIALIZED")
//        }
     }
}
