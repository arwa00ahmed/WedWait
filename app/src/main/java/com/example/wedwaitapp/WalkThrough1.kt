package com.example.wedwaitapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WalkThrough1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_walk_through1)
        val nextButton = findViewById<Button>(R.id.nextButton1)
        nextButton.setOnClickListener {
            val Intent= Intent(this,WalkThrough2::class.java)
            startActivity(Intent)
        }

        val skipButton = findViewById<Button>(R.id.myButton2)
        skipButton.setOnClickListener {
            val Intent= Intent(this,LogIn::class.java)
            startActivity(Intent)
        }
    }
}