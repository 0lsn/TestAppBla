package com.example.testappbla

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RatingBar

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBarChangeOnClick()


    }

    fun ratingBarChangeOnClick (){

    var dummyCounter = 0F

    val ratingbar = findViewById<RatingBar>(R.id.ratingBar)
    val progressbar = findViewById<ProgressBar>(R.id.progressBar)
    val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            dummyCounter++

            ratingbar.setRating(dummyCounter)

        }


    }


}
