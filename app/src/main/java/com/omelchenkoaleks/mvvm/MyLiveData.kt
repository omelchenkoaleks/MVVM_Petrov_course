package com.omelchenkoaleks.mvvm

import androidx.lifecycle.LiveData

class MyLiveData : LiveData<String>() {

    // Имитация добавления данных, то есть изменение LiveData
    fun setValueToLiveData(str: String) {
        value = str
    }

    override fun onActive() {
        super.onActive()
        println("onActive")
        // Connect to DB
    }

    override fun onInactive() {
        super.onInactive()
        println("onInactive")
        // Disconnect
    }
}