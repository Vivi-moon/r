package com.example.brainbit2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBegin = findViewById<Button>(R.id.buttonBegin)
        buttonBegin.setOnClickListener {
            val intent = Intent(this@MainActivity, CheckingСonnection::class.java)
            startActivity(intent)
            finish()
        }
        val buttonAll: Button = findViewById(R.id.buttonNext)
        buttonAll.setOnClickListener {
            val intent = Intent(this@MainActivity, CheckingСonnection::class.java)
            startActivity(intent)
            finish()
        }

    }
}