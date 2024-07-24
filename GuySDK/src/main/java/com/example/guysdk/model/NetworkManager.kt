package com.example.guysdk.model

import org.json.JSONObject

interface NetworkManager {

    fun init()
    fun post(api: String, params: Map<String, String>): JSONObject?
    fun get(api: String, params: Map<String, String>): JSONObject?
}