package com.example.kotlinreader.di

import com.example.kotlinreader.AppExecutors
import com.example.kotlinreader.AppStorage
import com.example.kotlinreader.DataRepository
import com.example.kotlinreader.model.NewsDatabase
import com.example.kotlinreader.viewmodel.NewsListViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.applicationContext

val readerDIModule = applicationContext {
    bean { AppStorage(get()) }
    bean { NewsDatabase.getInstance(androidApplication()) }
    bean { DataRepository.getInstance(AppExecutors(), get(), get()) }
    bean { NewsListViewModel(get()) }
}