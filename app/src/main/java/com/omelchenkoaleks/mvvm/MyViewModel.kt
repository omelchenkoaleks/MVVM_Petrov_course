package com.omelchenkoaleks.mvvm

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    val liveData = MutableLiveData<String>()

    init {
        startTimer()
    }

    private fun startTimer() {
        object : CountDownTimer(20000, 1000) {
            override fun onFinish() {
            }

            override fun onTick(millisUntilFinished: Long) {
                liveData.value = (millisUntilFinished / 1000).toString()
            }
        }.start()
    }
}