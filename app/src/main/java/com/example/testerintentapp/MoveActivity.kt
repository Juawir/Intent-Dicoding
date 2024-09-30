package com.example.testerintentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.testerintentapp.ui.theme.TesterIntentAppTheme

class MoveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesterIntentAppTheme {
                Text(text = "Welcome to Move Activity!")
            }
        }
    }
}
