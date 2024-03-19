package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResultSingleRandom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_single_random)

        val again: Button = findViewById(R.id.again)
        val record: Button = findViewById(R.id.record)
        val back: Button = findViewById(R.id.back)

        val agentimg: ImageView = findViewById(R.id.agentimg)
        val agentname: TextView = findViewById(R.id.agentname)

        val randomAgent = intent.getStringExtra("randomAgent")

        agentname.text = randomAgent

        val imageName = when (randomAgent) {
            "Jett" -> "jett"
            "Raze" -> "raze"
            "Breach" -> "raze"
            "Omen" -> "omen"
            "Brimstone" -> "brimstone"
            "Phoenix" -> "phoenix"
            "Sage" -> "sage"
            "Sova" -> "sova"
            "Viper" -> "viper"
            "Cypher" -> "cypher"
            "Rayna" -> "rayna"
            "Killjoy" -> "killjoy"
            "Skye" -> "skye"
            "Yoru" -> "yoru"
            "Astra" -> "astra"
            "Kayo" -> "kayo"
            "Chamber" -> "chamber"
            "Neon" -> "neon"
            "Fade" -> "fade"
            "Harbor" -> "harbor"
            "Gekko" -> "gekko"
            "Deadlock" -> "deadlock"
            "Iso" -> "iso"
            else -> "Unknown"

        }
        val imageResourceId = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg.setImageResource(imageResourceId)


        again.setOnClickListener {
            val randomAgent = getRandomAgent()
            updateUI(randomAgent)
        }

        record.setOnClickListener {
            val intent = Intent(this, SingleRecord::class.java)
            startActivity(intent)
            finish()
        }

        back.setOnClickListener {
            val intent = Intent(this, SingleRandom::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun getRandomAgent(): String {
        val agents = listOf(
            "Jett", "Raze", "Breach", "Omen", "Brimstone", "Phoenix", "Sage", "Sova",
            "Viper", "Cypher", "Rayna", "Killjoy", "Skye", "Yoru", "Astra", "Kayo",
            "Chamber", "Neon", "Fade", "Harbor", "Gekko", "Deadlock", "Iso"
        )
        return agents.random()
    }

    private fun updateUI(agent: String) {
        val agentimg: ImageView = findViewById(R.id.agentimg)
        val agentname: TextView = findViewById(R.id.agentname)

        agentname.text = agent

        val imageName = when (agent) {
            "Jett" -> "jett"
            "Raze" -> "raze"
            "Breach" -> "raze"
            "Omen" -> "omen"
            "Brimstone" -> "brimstone"
            "Phoenix" -> "phoenix"
            "Sage" -> "sage"
            "Sova" -> "sova"
            "Viper" -> "viper"
            "Cypher" -> "cypher"
            "Rayna" -> "rayna"
            "Killjoy" -> "killjoy"
            "Skye" -> "skye"
            "Yoru" -> "yoru"
            "Astra" -> "astra"
            "Kayo" -> "kayo"
            "Chamber" -> "chamber"
            "Neon" -> "neon"
            "Fade" -> "fade"
            "Harbor" -> "harbor"
            "Gekko" -> "gekko"
            "Deadlock" -> "deadlock"
            "Iso" -> "iso"
            else -> "Unknown"
        }
        val imageResourceId = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg.setImageResource(imageResourceId)
    }
}
