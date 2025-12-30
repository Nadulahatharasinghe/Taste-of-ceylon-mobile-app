package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile)

        val textName = findViewById<TextView>(R.id.textName)
        val btnSave = findViewById<Button>(R.id.btnSave)

        // Get name from intent
        val userName = intent.getStringExtra("USER_NAME")
        if (!userName.isNullOrEmpty()) {
            textName.text = "Name: $userName"
        }

        // Save button -> go back to MainActivity
        btnSave.setOnClickListener {
            val intent = Intent(this, MainPage::class.java)
            // Clear backstack so MainActivity becomes the home screen
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish() // close UserProfileActivity
        }
    }
}
