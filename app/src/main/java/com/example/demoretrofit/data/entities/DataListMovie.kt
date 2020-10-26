package com.example.demoretrofit.data.entities

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//data class DataListMovie(
//    @SerializedName("popularity") val popularity: Double,
//    @SerializedName("vote_count") val voteCount: Int,
//    @SerializedName("video") val video: Boolean,
//    @SerializedName("poster_path") val posterPath: String,
//    @SerializedName("id") val id: Int,
//    @SerializedName("adult") val adult: Boolean,
//    @SerializedName("backdrop_path") val backdropPath: String,
//    @SerializedName("original_language") val originalLanguage: String,
//    @SerializedName("original_title") val originalTitle: String,
//    @SerializedName("genre_ids") val genreId: List<Int>,
//    @SerializedName("title") val title: String,
//    @SerializedName("overview") val overview: String,
//    @SerializedName("release_date") val releaseDate: String
//)

@JsonClass(generateAdapter = true)
data class DataListMovie(
    @field:Json(name = "popularity") val popularity: Double,
    @field:Json(name = "vote_count") val voteCount: Int,
    @field:Json(name = "video") val video: Boolean,
    @field:Json(name = "poster_path") val posterPath: String,
    @field:Json(name = "id") val id: Int,
    @field:Json(name = "adult") val adult: Boolean,
    @field:Json(name = "backdrop_path") val backdropPath: String,
    @field:Json(name = "original_language") val originalLanguage: String,
    @field:Json(name = "original_title") val originalTitle: String,
    @field:Json(name = "genre_ids") val genreId: List<Int>,
    @field:Json(name = "title") val title: String,
    @field:Json(name = "overview") val overview: String,
    @field:Json(name = "release_date") val releaseDate: String
)