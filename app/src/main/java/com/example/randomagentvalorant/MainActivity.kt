package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val singleRan: Button = findViewById(R.id.singleRan)
        val teamRan: Button = findViewById(R.id.teamRan)

        singleRan.setOnClickListener {
            val intent = Intent(this, SingleRandom::class.java)
            startActivity(intent)
            finish()
        }

        teamRan.setOnClickListener {
            val intent = Intent(this, TeamRandom::class.java)
            startActivity(intent)
            finish()
        }
    }
}