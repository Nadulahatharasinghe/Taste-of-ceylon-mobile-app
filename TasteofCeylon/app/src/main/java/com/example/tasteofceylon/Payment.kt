package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

        val btnPay: Button = findViewById(R.id.btnPayNow)
        val btnCancel: Button = findViewById(R.id.btnCancelPayment)

        // Pay Now
        btnPay.setOnClickListener {
            startActivity(Intent(this, PaymentSuccess::class.java))
        }

        // Cancel Payment
        btnCancel.setOnClickListener {
            val intent = Intent(this, MainPage::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
