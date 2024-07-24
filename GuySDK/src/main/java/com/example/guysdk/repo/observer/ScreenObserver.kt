package com.example.guysdk.repo.observer

import android.app.Application
import com.example.guysdk.model.IObserver

class ScreenObserver: IObserver {
    override fun init(application: Application) {
        application.registerActivityLifecycleCallbacks(GuySDKActivityLifecycleCallbacks())
    }
}