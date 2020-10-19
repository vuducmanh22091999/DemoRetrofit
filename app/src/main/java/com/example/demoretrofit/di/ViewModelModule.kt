package com.example.demoretrofit.di

import com.example.demoretrofit.ui.load_movie.LoadMovieViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewmodelRepository = module {
    viewModel {
        LoadMovieViewModel(get())
    }
}