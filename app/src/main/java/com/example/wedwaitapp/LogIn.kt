package com.example.wedwaitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageButton
import com.google.android.material.textfield.TextInputLayout
import android.view.View

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, WalkThroug3::class.java)
            startActivity(intent)
            finish()
        }

        val editTextEmail: EditText = findViewById(R.id.editTextTextEmailAddress2)
        editTextEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.isNullOrEmpty()) {
                    editTextEmail.setTextColor(resources.getColor(android.R.color.darker_gray))
                } else {
                    editTextEmail.setTextColor(resources.getColor(android.R.color.black))
                }
            }
        })

        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword2)
        val passwordInputLayout = findViewById<TextInputLayout>(R.id.passwordTextInputLayout)

        passwordEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.isNullOrEmpty()) {
                    passwordEditText.setTextColor(resources.getColor(android.R.color.darker_gray))
                } else {
                    passwordEditText.setTextColor(resources.getColor(android.R.color.black))
                }
            }
        })

        passwordEditText.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                passwordInputLayout.hint = ""
            } else {
                passwordInputLayout.hint = "Enter your Password"
            }
        }
    }

    fun onForgotPasswordClicked(view: View) {
        val intent = Intent(this, forgotPassword::class.java)
        startActivity(intent)
    }

    fun onLoginClicked(view: View) {
        val intent = Intent(this, home::class.java)
        startActivity(intent)
    }

    fun onGoogleSignInClicked(view: View) {

    }

    fun onFacebookSignInClicked(view: View) {

    }

    fun onCustomXButtonClicked(view: View) {

    }

    fun onRegisterNowClicked(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }
}


