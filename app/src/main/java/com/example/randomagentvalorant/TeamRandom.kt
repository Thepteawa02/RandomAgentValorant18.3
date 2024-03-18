package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TeamRandom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_random)

        val again: Button = findViewById(R.id.again)
        val record: Button = findViewById(R.id.record)
        val back: Button = findViewById(R.id.back)

        again.setOnClickListener {

        }

        record.setOnClickListener {
            val intent = Intent(this, TeamRecord::class.java)
            startActivity(intent)
            finish()
        }

        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}