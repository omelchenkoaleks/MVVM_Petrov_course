package com.omelchenkoaleks.mvvm

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    // Lifecycle :
//    private val getData = GetData()

//    var liveDataString = MutableLiveData<String>()

    private val liveData = MyLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveData.observe(this, Observer {

        })




        // В главном потоке:
//        liveDataString.value = "Hello LiveData!"
//        text_for_liveData.text = liveDataString.value


        // ----- Lifecycle : -----
        /*
            мы можем передать экземплят getData, потому что класс реализует
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
