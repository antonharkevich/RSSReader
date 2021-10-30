package com.example.kotlinreader.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinreader.DataRepository
import com.example.kotlinreader.model.NewsItem

class NewsListViewModel(private val repository: DataRepository): ViewModel() {
    private val mObservableNews: MediatorLiveData<List<NewsItem>> = MediatorLiveData()

    val news: LiveData<List<NewsItem>>
        get() = mObservableNews

    init {
        // set by default null, until we get data from the database.
        mObservableNews.value = null

        // observe the changes of the products from the database and forward them
        mObservableNews.addSource(repository.news) { mObservableNews.setValue(it) }

    }

    fun getNewsItem(id: Long): LiveData<NewsItem> {
        return repository.loadNewsItem(id)
    }

    fun updateDataFromNetwork() {
        repository.loadNewsItemsFromNetwork()
    }

    fun tryToLoadDataFromNewSource(url: String) {
        repository.loadNewsItemsFromUrl(url)
    }

}