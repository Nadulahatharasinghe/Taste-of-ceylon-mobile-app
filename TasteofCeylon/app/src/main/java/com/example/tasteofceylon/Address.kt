package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Address : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.address)

        val btnNext: Button = findViewById(R.id.btnConfirmDelivery)
        val btnCancel: Button = findViewById(R.id.btnCancelDelivery)

        // Confirm Delivery
        btnNext.setOnClickListener {
            startActivity(Intent(this, ViewOrder::class.java))
        }

        //  Cancel Delivery
        btnCancel.setOnClickListener {
            val intent = Intent(this, MainPage::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
