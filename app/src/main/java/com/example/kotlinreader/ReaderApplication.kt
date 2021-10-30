package com.example.kotlinreader

import android.app.Application
import com.example.kotlinreader.di.readerDIModule
import org.koin.android.ext.android.startKoin

class ReaderApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(readerDIModule))
    }
}