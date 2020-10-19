package com.example.demoretrofit.ui.load_movie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demoretrofit.data.entities.DataMovie
import com.example.demoretrofit.data.repository.MovieRepository
import kotlinx.coroutines.launch

class LoadMovieViewModel(private val movieRepository: MovieRepository): ViewModel() {
    var movie : MutableLiveData<DataMovie> = MutableLiveData()

    fun setViewModel(apiKey: String) {
        viewModelScope.launch {
            val response = movieRepository.getAllMovie(apiKey)
            if (response.isSuccessful && response.body() != null) {
                movie.value = response.body()
            }
        }
    }
}