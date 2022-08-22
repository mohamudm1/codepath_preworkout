package com.example.bridge

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This Kotlin file is where we are going to handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //Display custumized text to show 'Hello from {name}'
        // 1. Add a button to out layout

        // Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener{
            // Handle button tap
            // 2. Set up logic to know when user has tapped on button
            Log.i("Mo", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(Resources().getColor(R.color.white))

        }

        // 3. Change the color of the text
    }
}