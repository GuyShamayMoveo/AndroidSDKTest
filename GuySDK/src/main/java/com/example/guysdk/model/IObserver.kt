package com.example.guysdk.model

import android.app.Application

interface IObserver {
    fun init(application: Application)
}