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
        val checkDickButton: Button = findViewById(R.id.checkButton)
        checkDickButton.setOnClickListener { checkDickSize() }
        val thirdPageButton: Button = findViewById(R.id.comeToPage3)
        thirdPageButton.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }

    private fun checkDickSize() {
        val randomInt = (1..10).random()
        Toast.makeText(this, resources.getText(R.string.reactionToast), Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.resultText)
        resultText.text = randomInt.toString()
    }
}