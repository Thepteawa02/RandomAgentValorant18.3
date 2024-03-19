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

        val agentNames: List<String>? = intent.getStringArrayListExtra("agentNames")

        val randomAgent = intent.getStringExtra("randomAgent")

        agentname.text = randomAgent

        val imageName = when (randomAgent) {
            "Jett" -> "jett"
            "Raze" -> "raze"
            "Breach" -> "breach"
            "Omen" -> "omen"
            "Brimstone" -> "brimstone"
            "Phoenix" -> "phoenix"
            "Sage" -> "sage"
            "Sova" -> "sova"
            "Viper" -> "viper"
            "Cypher" -> "cypher"
            "Reyna" -> "reyna"
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
            else -> ""
        }

        val imageResourceId = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg.setImageResource(imageResourceId)


        again.setOnClickListener {
            val agentNames = intent.getStringArrayListExtra("agentNames")
            if (agentNames != null) {
                updateUI(agentNames)
            }
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

    private fun updateUI(agent: ArrayList<String>) {
        val agentimg: ImageView = findViewById(R.id.agentimg)
        val agentname: TextView = findViewById(R.id.agentname)

        if (agent.isNotEmpty()) {
            val randomAgent = agent.random()
            agentname.text = randomAgent

            val imageName = when (randomAgent) {
                "Jett" -> "jett"
                "Raze" -> "raze"
                "Breach" -> "breach"
                "Omen" -> "omen"
                "Brimstone" -> "brimstone"
                "Phoenix" -> "phoenix"
                "Sage" -> "sage"
                "Sova" -> "sova"
                "Viper" -> "viper"
                "Cypher" -> "cypher"
                "Reyna" -> "reyna"
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
                else -> ""
            }
            val imageResourceId = resources.getIdentifier(imageName, "drawable", packageName)
            agentimg.setImageResource(imageResourceId)
        }
    }
}
