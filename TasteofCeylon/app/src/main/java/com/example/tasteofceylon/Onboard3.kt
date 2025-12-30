package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard3)

        val btnFinish: Button = findViewById(R.id.btnNext3)
        btnFinish.setOnClickListener {
            // Go back to MainActivity after onboarding
            // Use 'this' to refer to the current Onboard3 activity instance as the context
            startActivity(Intent(this, UserLogin::class.java))
            finish()
        }
    }
}
