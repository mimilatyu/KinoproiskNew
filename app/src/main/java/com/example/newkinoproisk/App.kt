package com.example.newkinoproisk

import android.app.Application
import android.content.res.Configuration

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory(){
        super.onLowMemory()
    }

    companion object{
        lateinit var instance: App
            private set
    }
}

