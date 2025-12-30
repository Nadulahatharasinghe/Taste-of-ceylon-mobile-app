package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewOrder  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_order)

        // Get Views
        val txtOrderId = findViewById<TextView>(R.id.txtOrderId)
        val txtOrderDate = findViewById<TextView>(R.id.txtOrderDate)
        val btnBackHome = findViewById<Button>(R.id.btnBackHome)

        // Optional: Get Order Info from Intent
        val orderId = intent.getStringExtra("ORDER_ID") ?: "#ORD123456"
        val orderDate = intent.getStringExtra("ORDER_DATE") ?: "23 Aug 2025"

        txtOrderId.text = "Order ID: $orderId"
        txtOrderDate.text = "Date: $orderDate"

        // Back to Home
        btnBackHome.setOnClickListener {
            val intent = Intent(this, MainPage::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}