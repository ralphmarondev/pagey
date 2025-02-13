package com.ralphmarondev.pagey

import android.app.Application
import com.ralphmarondev.pagey.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@MyApp)
        }
    }
}