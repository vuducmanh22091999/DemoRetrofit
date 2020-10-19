package com.example.demoretrofit.di

import com.example.demoretrofit.data.repository.MovieRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { MovieRepository(get()) }
}