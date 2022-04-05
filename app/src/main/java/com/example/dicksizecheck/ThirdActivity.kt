package com.example.dicksizecheck
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


    }

    fun clickForFact(view: View) {
        Toast.makeText(
            this,
            "А вы знали, что Тончик, Харин, Крейзи Эпл и Рашн Чака - один и тот же человек?",
            Toast.LENGTH_LONG
        ).show()


    }
}