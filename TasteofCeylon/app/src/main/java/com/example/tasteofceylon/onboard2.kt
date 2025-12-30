package com.example.tasteofceylon
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class onboard2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard2)

        val btnNext2: Button = findViewById(R.id.btnNext2)
        val checkboxAgree: CheckBox = findViewById(R.id.checkboxAgree)

        btnNext2.setOnClickListener {
            if (checkboxAgree.isChecked) {
                // Go to Onboard3 screen
                startActivity(Intent(this, Onboard3::class.java))
                finish()
            } else {
                Toast.makeText(this, "Please accept Terms & Conditions", Toast.LENGTH_SHORT).show()
            }
        }
    }
}