package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaymentSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_success)

        val btnViewOrder: Button = findViewById(R.id.btnViewOrder)
        val btnBackHome: Button = findViewById(R.id.btnBackHome)

        //  View Order Button
        btnViewOrder.setOnClickListener {
            startActivity(Intent(this, ViewOrder::class.java))
        }

        //  Back to Home Button
        btnBackHome.setOnClickListener {
            val intent = Intent(this, MainPage::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
