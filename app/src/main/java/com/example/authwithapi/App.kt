package com.example.authwithapi

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class App: Application() {
    companion object {
        lateinit var authKey:String
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        init {
            System.loadLibrary("native-lib")
        }
    }
    private external fun key(): String
    override fun onCreate() {
        authKey = key()
        super.onCreate()
        context = applicationContext
    }


}