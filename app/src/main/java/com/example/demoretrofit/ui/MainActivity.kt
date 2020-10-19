package com.example.demoretrofit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demoretrofit.R
import com.example.demoretrofit.ui.load_movie.LoadMovieActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListener()
    }

    private fun initListener() {
        btnSwitchAct.setOnClickListener(this)
    }

    private fun switchAct() {
        val intent = Intent(this, LoadMovieActivity::class.java)
        startActivity(intent)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnSwitchAct -> switchAct()
        }
    }
}