package com.example.dicksizecheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val checkDickButton: Button = findViewById(R.id.Check_button)
        checkDickButton.setOnClickListener { checkDickSize() }
        val thirdPageButton: Button = findViewById(R.id.ComeTo3page)
        thirdPageButton.setOnClickListener {
            startActivity(
                Intent(this, ThirdActivity::class.java)
            )
        }
    }

    private fun checkDickSize() {
        val randomInt = (1..10).random()
        Toast.makeText(this, "Wow! So small!", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()


    }
}