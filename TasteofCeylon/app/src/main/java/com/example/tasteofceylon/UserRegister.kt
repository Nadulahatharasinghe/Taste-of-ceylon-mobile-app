package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserRegister: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_register)

        val btnRegister: Button = findViewById(R.id.registerBtn)
        btnRegister.setOnClickListener {
            startActivity(Intent(this, MainPage::class.java))
        }
    }
}