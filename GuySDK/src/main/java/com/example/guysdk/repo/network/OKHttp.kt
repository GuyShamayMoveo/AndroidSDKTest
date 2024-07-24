package com.example.guysdk.repo.network

import android.app.Application
import android.util.Log
import com.example.guysdk.model.NetworkManager
import org.json.JSONObject

/**
 * If we want to change the OKHttp library. all we need to do is to create a new class that implements IGuySDK
 */
class OKHttp : NetworkManager {
    companion object {
        private const val TAG = "GuySDK"
    }

    override fun init() {
        Log.d(TAG, "init: OKHttp")
    }

    override fun post(api: String, params: Map<String, String>): JSONObject? {
        Log.d(TAG, "post: OKHttp")
        return null
    }

    override fun get(api: String, params: Map<String, String>): JSONObject? {
        Log.d(TAG, "get: OKHttp")
        return null
    }
}