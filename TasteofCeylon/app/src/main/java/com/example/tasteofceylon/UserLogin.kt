package com.example.tasteofceylon


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserLogin  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userlogin)

        // Login button
        val btnLogin: Button = findViewById(R.id.loginBtn2)
        btnLogin.setOnClickListener {
            // TODO: Add your real login validation here
            startActivity(Intent(this, MainPage::class.java))
        }

        // Register link (TextView)
        val registerLink: TextView = findViewById(R.id.registerLink)
        registerLink.setOnClickListener {
            startActivity(Intent(this, UserRegister::class.java))
        }
    }
}