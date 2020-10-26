package com.example.demoretrofit.ui.load_movie

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demoretrofit.data.entities.Categories
import com.example.demoretrofit.data.entities.DataMovie
import com.example.demoretrofit.data.repository.MovieRepository
import kotlinx.coroutines.launch

class LoadMovieViewModel(private val movieRepository: MovieRepository): ViewModel() {
    var movie : MutableLiveData<DataMovie> = MutableLiveData()
    var categories: MutableLiveData<Categories> = MutableLiveData()

    fun setViewModel(apiKey: String) {
        viewModelScope.launch {
            val response = movieRepository.getAllMovie(apiKey)
            if (response.isSuccessful && response.body() != null) {
                movie.value = response.body()
            }
        }
    }

    fun getCategories(xApiKey: String) {
        viewModelScope.launch {
            val response = movieRepository.getAllCategories(xApiKey)
            if (response.isSuccessful && response.body() != null) {
                categories.value = response.body()
            }
        }
    }
}