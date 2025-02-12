package com.example.cyberedu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val startGameButton: Button = findViewById(R.id.button_start_game)
        startGameButton.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
            // Apply a soft fade animation
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}
