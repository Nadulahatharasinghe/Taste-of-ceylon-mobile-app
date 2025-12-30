package com.example.tasteofceylon

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  Price TextViews
        val price1: TextView = findViewById(R.id.price1)
        val price2: TextView = findViewById(R.id.price2)
        val price3: TextView = findViewById(R.id.price3)
        val price4: TextView = findViewById(R.id.price4)

        //  Icons
        val userIcon: ImageView = findViewById(R.id.userIcon)
        val cartIcon: ImageView = findViewById(R.id.cartIcon)

        // When clicking prices → Go to Quantity page
        price1.setOnClickListener {
            startActivity(Intent(this, Quantity::class.java))
        }
        price2.setOnClickListener {
            startActivity(Intent(this, Quantity::class.java))
        }
        price3.setOnClickListener {
            startActivity(Intent(this, Quantity::class.java))
        }
        price4.setOnClickListener {
            startActivity(Intent(this, Quantity::class.java))
        }

        // User Icon → Profile Page
        userIcon.setOnClickListener {
            startActivity(Intent(this, UserProfileActivity::class.java))
        }

        //  Cart Icon → Quantity Page
        cartIcon.setOnClickListener {
            startActivity(Intent(this, Quantity::class.java))
        }
    }
}