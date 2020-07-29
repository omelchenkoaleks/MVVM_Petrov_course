package com.omelchenkoaleks.mvvm

import androidx.lifecycle.LiveData

class MyLiveData : LiveData<String>() {

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