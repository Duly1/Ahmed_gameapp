package com.example.ahmed_gameapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for a couple of seconds before moving to the next activity
        val intent = Intent(this, QuestionActivity::class.java)
        startActivity(intent)
        finish() // Finish the splash activity so that the user can't go back to it
    }
}
