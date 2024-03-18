package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TeamRecord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_record)

        val back: Button = findViewById(R.id.back)



        back.setOnClickListener {
            val intent = Intent(this, TeamRandom::class.java)
            startActivity(intent)
            finish()
        }


    }
}