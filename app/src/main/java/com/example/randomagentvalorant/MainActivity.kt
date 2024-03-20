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
            val team = generateRandomTeam()
            val intent = Intent(this, TeamRandom::class.java)
            intent.putStringArrayListExtra("team", team)
            startActivity(intent)
        }
    }

    private fun generateRandomTeam(): ArrayList<String> {
        val agents = mutableListOf(
            "Jett", "Raze", "Breach", "Omen", "Brimstone", "Phoenix", "Sage", "Sova",
            "Viper", "Cypher", "Reyna", "Killjoy", "Skye", "Yoru", "Astra", "Kayo",
            "Chamber", "Neon", "Fade", "Harbor", "Gekko", "Deadlock", "Iso"
        )
        val teamSize = 5
        val team = ArrayList<String>()

        // สุ่มตัวละครให้กับทีม
        for (i in 0 until teamSize) {
            val randomIndex = (0 until agents.size).random()
            team.add(agents.removeAt(randomIndex))
        }

        return team
    }
}