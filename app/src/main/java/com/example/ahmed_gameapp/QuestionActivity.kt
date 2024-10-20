package com.example.ahmed_gameapp

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    var score = 0
    val correctAnswer = "Paris" // Example of the correct answer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        confirmButton.setOnClickListener {
            val selectedId: Int = answerGroup.checkedRadioButtonId

            if (selectedId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(selectedId)
                val selectedAnswer = selectedRadioButton.text.toString()

                // Check if the answer is correct
                if (selectedAnswer == correctAnswer) {
                    score += 1
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show()
                }

                // After answering, move to the StatsActivity to show the score
                val intent = Intent(this, StatsActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
            } else {
                // Display a message if no answer is selected
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
            }
        }
    }
}