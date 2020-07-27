package com.omelchenkoaleks.mvvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class GetData: LifecycleObserver {

    /*
        нужно как-то понять в каком сотоянии находится наш LifecycleOwner(владелец жизненного цикла)
        в той активити, где мы подписались на него:
            - это делается с помощью анотаций, в которой мы выбираем когда эта функция должна
            быть отработана
     */

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getData() {
        println("get data")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun sendData() {
        println("send data")
    }
}