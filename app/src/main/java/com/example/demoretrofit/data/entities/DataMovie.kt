package com.example.demoretrofit.data.entities

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataMovie(
    @field:Json(name = "page") val page: Int,
    @field:Json(name = "total_results") val totalResults: Int,
    @field:Json(name = "total_pages") val totalPages: Int,
    @field:Json(name = "results") val listsMovie: List<DataListMovie>
)

//data class DataMovie(
//    @SerializedName("page") val page : Int,
//    @SerializedName("total_results") val totalResults: Int,
//    @SerializedName("total_pages") val totalPages: Int,
//    @SerializedName("results") val listsMovie: List<DataListMovie>
//)