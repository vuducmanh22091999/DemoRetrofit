package com.example.demoretrofit.data.entities

import com.google.gson.annotations.SerializedName

data class DataMovie(
    @SerializedName("page") val page: Int,
    @SerializedName("total_results") val totalResults : Int,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("results") val listsMovie: List<DataListMovie>
)