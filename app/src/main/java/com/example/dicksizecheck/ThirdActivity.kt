package com.example.dicksizecheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val clickForFacts: ImageView = findViewById(R.id.tonchikImage)
        clickForFacts.setOnClickListener { clickForFact() }
    }

    private fun clickForFact() {
        Toast.makeText(
            this, resources.getText(R.string.factAboutTonchik),
            Toast.LENGTH_LONG
        ).show()
    }
}