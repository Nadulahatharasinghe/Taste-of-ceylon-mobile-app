package com.example.tasteofceylon
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class onboard1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard1)

        // Button should now work
        findViewById<View>(R.id.btnNext).setOnClickListener {
            val intent = Intent(this, onboard2::class.java)  // 👈 exact class name
            startActivity(intent)
        }
    }
}