package com.example.tasteofceylon

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class UserRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_register)

        // Find EditText fields
        val fullName = findViewById<EditText>(R.id.editTextFullName)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val confirmPassword = findViewById<EditText>(R.id.editTextConfirmPassword)
        val registerBtn = findViewById<Button>(R.id.registerBtn)

        // Button click event
        registerBtn.setOnClickListener {
            val nameText = fullName.text.toString().trim()
            val emailText = email.text.toString().trim()
            val passText = password.text.toString().trim()
            val confirmText = confirmPassword.text.toString().trim()

            if (nameText.isEmpty() || emailText.isEmpty() || passText.isEmpty() || confirmText.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else if (passText != confirmText) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "✅ Registration Successful!", Toast.LENGTH_SHORT).show()
                // 👉 Here you can navigate to LoginActivity or ProfileActivity
            }
        }
    }
}
