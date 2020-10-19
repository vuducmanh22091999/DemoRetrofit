package com.example.demoretrofit.data.remote

import com.example.demoretrofit.data.entities.DataMovie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieServices {
    @GET("movie/popular")
    suspend fun getListMovie(@Query("api_key") apiKey: String): Response<DataMovie>
}