package com.example.wedwaitapp

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val toggleButton: ImageButton = findViewById(R.id.togglePasswordButton)

        toggleButton.setOnClickListener {
            if (passwordEditText.inputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                toggleButton.setImageResource(R.drawable.toggle) // Replace with your hide icon
            } else {
                passwordEditText.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                toggleButton.setImageResource(R.drawable.closedeye) // Replace with your show icon
            }
            passwordEditText.setSelection(passwordEditText.text.length)
        }

        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun onLoginBtnClicked(view: View) {

        val intent = Intent(this, home::class.java)
        startActivity(intent)
    }

    fun onLogInClicked(view: View) {
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
    }
}
