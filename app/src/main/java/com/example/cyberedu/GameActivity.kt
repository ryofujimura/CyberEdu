package com.example.cyberedu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val nextButton: Button = findViewById(R.id.button_next)
        nextButton.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
            // Use the same soft fade transition
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}
