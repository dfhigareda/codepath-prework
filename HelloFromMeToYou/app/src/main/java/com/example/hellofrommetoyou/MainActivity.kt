package com.example.hellofrommetoyou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}'

        // User can tap a button to change the text color of the label.
        // 1. Add a button to the layout

        // Get a reference to button
        // 2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button tap
            // 3. Change the color of the text
            Log.i("Darita", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.pink))

        }
    }
}