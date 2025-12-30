package com.example.tasteofceylon


import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class Quantity : AppCompatActivity() {
    private var quantity = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qty_select)

        val txtQuantity = findViewById<TextView>(R.id.txtQuantity)
        val btnIncrease = findViewById<Button>(R.id.btnIncrease)
        val btnDecrease = findViewById<Button>(R.id.btnDecrease)
        val radioCash = findViewById<RadioButton>(R.id.radioCash)
        val radioOnline = findViewById<RadioButton>(R.id.radioOnline)
        val btnBuyNow = findViewById<Button>(R.id.btnBuyNow)

        // Quantity Increase
        btnIncrease.setOnClickListener {
            quantity++
            txtQuantity.text = quantity.toString()
        }

        // Quantity Decrease
        btnDecrease.setOnClickListener {
            if (quantity > 1) {
                quantity--
                txtQuantity.text = quantity.toString()
            } else {
                Toast.makeText(this, "Minimum quantity is 1", Toast.LENGTH_SHORT).show()
            }
        }

        // Buy Now
        btnBuyNow.setOnClickListener {
            when {
                radioCash.isChecked -> {
                    // Go to AddressActivity
                    val intent = Intent(this, Address::class.java)
                    intent.putExtra("QUANTITY", quantity)
                    startActivity(intent)
                }
                radioOnline.isChecked -> {
                    // Go to PaymentActivity
                    val intent = Intent(this, Payment::class.java)
                    intent.putExtra("QUANTITY", quantity)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this, "Please select a delivery method", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}