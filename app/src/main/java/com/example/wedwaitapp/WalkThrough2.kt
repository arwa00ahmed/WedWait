package com.example.wedwaitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.widget.Button


class WalkThrough2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walk_through2)

        val nextButton = findViewById<Button>(R.id.nextButton1)
        nextButton.setOnClickListener {
            val Intent= Intent(this,WalkThroug3::class.java)
            startActivity(Intent)
        }

        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, WalkThrough1::class.java)
            startActivity(intent)
            finish()
        }

        val skipButton = findViewById<Button>(R.id.myButton2)
        skipButton.setOnClickListener {
            val Intent= Intent(this,LogIn::class.java)
            startActivity(Intent)
        }
    }
}