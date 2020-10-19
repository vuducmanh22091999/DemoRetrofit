package com.example.demoretrofit.ui

import android.app.Application
import com.example.demoretrofit.di.appModule
import com.example.demoretrofit.di.repositoryModule
import com.example.demoretrofit.di.viewmodelRepository
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(appModule, repositoryModule, viewmodelRepository))
        }
    }
}