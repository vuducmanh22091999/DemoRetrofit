package com.example.demoretrofit.ui.load_movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoretrofit.R
import com.example.demoretrofit.data.entities.DataListMovie
import kotlinx.android.synthetic.main.item_movie.view.*

class LoadMovieAdapter(private val listMovie: List<DataListMovie>): RecyclerView.Adapter<LoadMovieAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(dataListMovie: DataListMovie) {
            itemView.itemMovies.text = dataListMovie.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view =  layoutInflater.inflate(R.layout.item_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(listMovie[position])
    }

    override fun getItemCount(): Int = listMovie.size
}