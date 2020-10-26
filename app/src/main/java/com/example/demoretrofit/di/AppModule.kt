package com.example.demoretrofit.di

import com.example.demoretrofit.R
import com.example.demoretrofit.data.entities.Categories
import com.example.demoretrofit.data.remote.MovieServices
import com.example.demoretrofit.ui.load_movie.LoadCategoriesAdapter
import com.example.demoretrofit.utils.BASE_URL
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
//    single { providerGson() }
//    single { providerRetrofit(get()) }
    single { providerMovie(get()) }
    single { providerHttp() }
    single { providerMoshi() }
}


fun providerGson(): Gson = GsonBuilder().create()

fun providerRetrofit(gson: Gson): Retrofit = Retrofit.Builder().baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create(gson)).build()

fun providerMoshi() : Retrofit = Retrofit.Builder().baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create()).build()


fun providerMovie(retrofit: Retrofit): MovieServices = retrofit.create(MovieServices::class.java)


fun providerHttp(): OkHttpClient {
    val okHttpBuilder = OkHttpClient.Builder()
    val logging = HttpLoggingInterceptor()
    logging.level = HttpLoggingInterceptor.Level.BODY
    okHttpBuilder.addInterceptor(logging)
    return okHttpBuilder.build()
}

