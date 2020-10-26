package com.example.demoretrofit.ui.load_movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoretrofit.R
import com.example.demoretrofit.data.entities.Categories
import com.example.demoretrofit.data.entities.DataMovie
import kotlinx.android.synthetic.main.activity_load_movie.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoadMovieActivity : AppCompatActivity() {
    private val loadMovieViewModel: LoadMovieViewModel by viewModel()
    lateinit var loadMovieAdapter: LoadMovieAdapter
    lateinit var loadCategoriesAdapter: LoadCategoriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_movie)

        loadMovieViewModel.setViewModel(getString(R.string.api_key_movie))
        loadMovieViewModel.movie.observe(this, Observer {
            setUpRecyclerView(it)
        })

//        loadMovieViewModel.getCategories(getString(R.string.x_api_key))
//        loadMovieViewModel.categories.observe(this, Observer {
//            getCategories(it)
//        })
    }

    private fun setUpRecyclerView(dataMovie: DataMovie) {
        loadMovieAdapter = LoadMovieAdapter(dataMovie.listsMovie)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcvLoadMovie.setHasFixedSize(true)
        rcvLoadMovie.layoutManager = linearLayoutManager
        rcvLoadMovie.adapter = loadMovieAdapter
    }

    private fun getCategories(categories: Categories) {
        loadCategoriesAdapter = LoadCategoriesAdapter(categories)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcvLoadMovie.setHasFixedSize(true)
        rcvLoadMovie.layoutManager = linearLayoutManager
        rcvLoadMovie.adapter = loadCategoriesAdapter
    }
}