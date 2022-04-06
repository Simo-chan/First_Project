package com.example.dicksizecheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextPageButton: Button = findViewById(R.id.nextPage)
        nextPageButton.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}