package com.example.testerintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MoveWithDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        // Get the data from Intent
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val name = intent.getStringExtra(EXTRA_NAME) ?: "Unknown"
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        // Set the received data to the TextView
        val text = "Name: $name, Your Age: $age"
        tvDataReceived.text = text
    }
}