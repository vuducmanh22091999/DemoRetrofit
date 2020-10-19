package com.example.demoretrofit.ui.load_movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoretrofit.R
import com.example.demoretrofit.data.entities.DataListMovie
import com.example.demoretrofit.data.entities.DataMovie
import kotlinx.android.synthetic.main.activity_load_movie.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoadMovieActivity : AppCompatActivity() {
    private val loadMovieViewModel : LoadMovieViewModel by viewModel()
    lateinit var loadMovieAdapter: LoadMovieAdapter
    private val listData: List<DataMovie> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_movie)

        loadMovieViewModel.setViewModel(getString(R.string.api_key_movie))
        initRecyclerView()
        setUpRecyclerView()
    }

    private fun initRecyclerView() {
        loadMovieViewModel.movie.observe(this, Observer {
            loadMovieAdapter = LoadMovieAdapter(it.listsMovie)
        })
    }

    private fun setUpRecyclerView() {
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcvLoadMovie.setHasFixedSize(true)
        rcvLoadMovie.layoutManager = linearLayoutManager
        rcvLoadMovie.adapter = loadMovieAdapter
    }
}