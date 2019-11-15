package com.example.mvvpcoroutine.base

import android.app.Application
import com.example.mvvpcoroutine.di.apiModule
import com.example.mvvpcoroutine.di.appModule
import com.example.mvvpcoroutine.di.networkModule
import com.example.mvvpcoroutine.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(listOf(appModule, apiModule, networkModule, viewModelModule))
        }
    }
}