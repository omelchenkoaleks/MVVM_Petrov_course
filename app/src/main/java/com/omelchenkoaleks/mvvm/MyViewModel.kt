package com.omelchenkoaleks.mvvm

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MyViewModel(app: Application) : AndroidViewModel(app) {

    val liveData = MutableLiveData<String>()

    init {
        startTimer()
    }

    private fun startTimer() {
        object : CountDownTimer(10000, 1000) {
            override fun onFinish() {
                Toast.makeText(getApplication(), "Hello", Toast.LENGTH_LONG).show()
            }

            override fun onTick(millisUntilFinished: Long) {
                liveData.value = (millisUntilFinished / 1000).toString()
            }
        }.start()
    }
}