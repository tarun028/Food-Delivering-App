package com.example.orderhere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        // Find the next button by its ID
        val nextButton: Button = findViewById(R.id.nextBtn)

        // Set OnClickListener to handle button clicks
        nextButton.setOnClickListener {
            // Create an Intent to navigate to the LoginActivity
            val intent = Intent(this@StartActivity, loginScreen::class.java)
            // Start the LoginActivity
            startActivity(intent)
        }
    }
}