package com.example.demoretrofit.data.repository

import com.example.demoretrofit.data.remote.MovieServices

class MovieRepository (private val movieServices: MovieServices) {
    suspend fun getAllMovie(apiKey: String) = movieServices.getListMovie(apiKey)
}