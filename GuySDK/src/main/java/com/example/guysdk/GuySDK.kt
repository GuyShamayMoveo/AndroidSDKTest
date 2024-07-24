package com.example.guysdk

import com.example.guysdk.model.IObserver
import com.example.guysdk.repo.observer.ScreenObserver

class GuySDK private constructor() {

    companion object {
        private var _instance: IObserver? = null

        fun getInstance(): IObserver {
            return _instance ?: synchronized(this) {
                _instance ?: ScreenObserver().also { _instance = it }
            }
        }

        const val TAG = "GuySDK"
    }
}