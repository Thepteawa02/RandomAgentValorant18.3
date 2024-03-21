package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.random.Random

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
            val agents = mutableListOf(
                "Jett", "Raze", "Breach", "Omen", "Brimstone", "Phoenix", "Sage", "Sova",
                "Viper", "Cypher", "Reyna", "Killjoy", "Skye", "Yoru", "Astra", "Kayo",
                "Chamber", "Neon", "Fade", "Harbor", "Gekko", "Deadlock", "Iso"
            )

            val controllerAgent = listOf("Omen", "Brimstone", "Viper", "Astra", "Harbor")
            val duelistAgent = listOf("Jett", "Raze", "Phoenix", "Reyna", "Yoru", "Neon", "Iso")
            val initiatorAgent = listOf("Breach", "Sova", "Skye", "Kayo", "Fade", "Gekko")
            val sentinelAgent = listOf("Sage", "Cypher", "Killjoy", "Chamber", "Deadlock")

            if (agents.isNotEmpty()) {
                val randomControllerIndex = Random.nextInt(controllerAgent.size)
                val randomDuelistIndex = Random.nextInt(duelistAgent.size)
                val randomInitiatorIndex = Random.nextInt(initiatorAgent.size)
                val randomSentinelIndex = Random.nextInt(sentinelAgent.size)

                val randomControllerAgent = controllerAgent[randomControllerIndex]
                val randomDuelistAgent = duelistAgent[randomDuelistIndex]
                val randomInitiatorAgent = initiatorAgent[randomInitiatorIndex]
                val randomSentinelAgent = sentinelAgent[randomSentinelIndex]

                val agentSelected = listOf(
                    randomControllerAgent,
                    randomDuelistAgent,
                    randomInitiatorAgent,
                    randomSentinelAgent
                )
                agents.removeAll(agentSelected)

                if (agents.isNotEmpty()) {
                    val randomAnyAgentIndex = Random.nextInt(agents.size)
                    val randomAnyAgent = agents[randomAnyAgentIndex]

                    val intent = Intent(this, TeamRandom::class.java)
                    intent.putExtra("randomControllerAgent", randomControllerAgent)
                    intent.putExtra("randomDuelistAgent", randomDuelistAgent)
                    intent.putExtra("randomInitiatorAgent", randomInitiatorAgent)
                    intent.putExtra("randomSentinelAgent", randomSentinelAgent)
                    intent.putExtra("randomAnyAgent", randomAnyAgent)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}