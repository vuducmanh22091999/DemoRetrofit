package com.example.demoretrofit.ui.load_movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoretrofit.R
import kotlinx.android.synthetic.main.activity_load_movie.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoadMovieActivity : AppCompatActivity() {
    private val loadMovieViewModel : LoadMovieViewModel by viewModel()
    lateinit var loadMovieAdapter: LoadMovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_movie)

        loadMovieViewModel.setViewModel(getString(R.string.api_key_movie))
        initRecyclerView()
    }

    private fun initRecyclerView() {
        loadMovieViewModel.movie.observe(this, Observer {
            loadMovieAdapter = LoadMovieAdapter(it.listsMovie)
            val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            rcvLoadMovie.setHasFixedSize(true)
            rcvLoadMovie.layoutManager = linearLayoutManager
            rcvLoadMovie.adapter = loadMovieAdapter
        })
    }
}