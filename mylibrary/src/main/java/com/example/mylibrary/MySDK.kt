package com.example.mylibrary

import android.util.Log

class MySDK {

    fun doSomething() {
        Log.d("MySDK", "doSomething")
    }
    companion object {
        private var _instance: MySDK? = null
        fun getInstance(): MySDK {
            return _instance ?: synchronized(this) {
                _instance ?: MySDK().also { _instance = it }
            }
        }

    }
}