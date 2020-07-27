package com.omelchenkoaleks.mvvm

import androidx.lifecycle.LifecycleObserver

class GetData: LifecycleObserver {

    fun getData() {
        println("get data")
    }

    fun sendData() {
        println("send data")
    }
}