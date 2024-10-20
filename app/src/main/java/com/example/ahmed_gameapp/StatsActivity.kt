package com.example.ahmed_gameapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_stats.*

class StatsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        // Get the score from the intent and display it
        val score = intent.getIntExtra("score", 0)
        scoreText.text = "Your Score is $score"
    }
}