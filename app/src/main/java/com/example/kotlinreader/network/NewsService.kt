package com.example.kotlinreader.network

import com.example.kotlinreader.network.pojo.RSS
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url


interface NewsService {
    @GET
    fun getNews(@Url url: String): Call<RSS>
}