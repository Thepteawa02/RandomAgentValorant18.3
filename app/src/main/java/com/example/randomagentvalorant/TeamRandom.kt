package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class TeamRandom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_random)

        val again: Button = findViewById(R.id.again)
        val record: Button = findViewById(R.id.record)
        val back: Button = findViewById(R.id.back)

        val agentimage1: ImageView = findViewById(R.id.agentimage1)
        val agentname1: TextView = findViewById(R.id.agentName1)
        val positionimage1: ImageView = findViewById(R.id.positionimage1)
        val agentimage2: ImageView = findViewById(R.id.agentimage2)
        val agentname2: TextView = findViewById(R.id.agentName2)
        val positionimage2: ImageView = findViewById(R.id.positionimage2)
        val agentimage3: ImageView = findViewById(R.id.agentimage3)
        val agentname3: TextView = findViewById(R.id.agentName3)
        val positionimage3: ImageView = findViewById(R.id.positionimage3)
        val agentimage4: ImageView = findViewById(R.id.agentimage4)
        val agentname4: TextView = findViewById(R.id.agentName4)
        val positionimage4: ImageView = findViewById(R.id.positionimage4)
        val agentimage5: ImageView = findViewById(R.id.agentimage5)
        val agentname5: TextView = findViewById(R.id.agentName5)
        val positionimage5: ImageView = findViewById(R.id.positionimage5)

        val positionName1: TextView = findViewById(R.id.positionName1)
        val positionName2: TextView = findViewById(R.id.positionName2)
        val positionName3: TextView = findViewById(R.id.positionName3)
        val positionName4: TextView = findViewById(R.id.positionName4)
        val positionName5: TextView = findViewById(R.id.positionName5)

        val randomControllerAgent = intent.getStringExtra("randomControllerAgent")
        val randomDuelistAgent = intent.getStringExtra("randomDuelistAgent")
        val randomInitiatorAgent = intent.getStringExtra("randomInitiatorAgent")
        val randomSentinelAgent = intent.getStringExtra("randomSentinelAgent")
        val randomAnyAgent = intent.getStringExtra("randomAnyAgent")

            //Controller
            agentname1.text = randomControllerAgent
            val imageName1 = when (randomControllerAgent) {
                "Omen" -> "omen"
                "Brimstone" -> "brimstone"
                "Viper" -> "viper"
                "Astra" -> "astra"
                "Harbor" -> "harbor"
                else -> ""
            }
            val imageResourceId1 = resources.getIdentifier(imageName1, "drawable", packageName)
            agentimage1.setImageResource(imageResourceId1)
            positionimage1.setImageResource(R.drawable.controller)
            positionName1.text = "Controller"

            //Duelist
            agentname2.text = randomDuelistAgent
            val imageName2 = when (randomDuelistAgent) {
                "Jett" -> "jett"
                "Raze" -> "raze"
                "Phoenix" -> "phoenix"
                "Reyna" -> "reyna"
                "Yoru" -> "yoru"
                "Neon" -> "neon"
                "Iso" -> "iso"
                else -> ""
            }
            val imageResourceId2 = resources.getIdentifier(imageName2, "drawable", packageName)
            agentimage2.setImageResource(imageResourceId2)
            positionimage2.setImageResource(R.drawable.duelist)
            positionName2.text = "Duelist"

            //Initiator
            agentname3.text = randomInitiatorAgent
            val imageName3 = when (randomInitiatorAgent) {
                "Breach" -> "breach"
                "Sova" -> "sova"
                "Skye" -> "skye"
                "Kayo" -> "kayo"
                "Fade" -> "fade"
                "Gekko" -> "gekko"
                else -> ""
            }
            val imageResourceId3 = resources.getIdentifier(imageName3, "drawable", packageName)
            agentimage3.setImageResource(imageResourceId3)
            positionimage3.setImageResource(R.drawable.initiator)
            positionName3.text = "Initiator"

            //Sentinel
            agentname4.text = randomSentinelAgent
            val imageName4 = when (randomSentinelAgent) {
                "Sage" -> "sage"
                "Cypher" -> "cypher"
                "Killjoy" -> "killjoy"
                "Chamber" -> "chamber"
                "Deadlock" -> "deadlock"
                else -> ""
            }
            val imageResourceId4 = resources.getIdentifier(imageName4, "drawable", packageName)
            agentimage4.setImageResource(imageResourceId4)
            positionimage4.setImageResource(R.drawable.sentinel)
            positionName4.text = "Sentinel"

            //AnyAgent(ที่ยังไม่ถูกสุ่ม)
            agentname5.text = randomAnyAgent
            val imageName5 = when (randomAnyAgent) {
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
            if (randomAnyAgent == "Omen" || randomAnyAgent == "Brimstone" || randomAnyAgent == "Viper"
                || randomAnyAgent == "Astra" || randomAnyAgent == "Harbor"
            ) {
                val imageResourceId5 = resources.getIdentifier(imageName5, "drawable", packageName)
                agentimage5.setImageResource(imageResourceId5)
                positionimage5.setImageResource(R.drawable.controller)
                positionName5.text = "Controller"
            } else if (randomAnyAgent == "Jett" || randomAnyAgent == "Raze" || randomAnyAgent == "Phoenix"
                || randomAnyAgent == "Reyna" || randomAnyAgent == "Yoru" || randomAnyAgent == "Neon" ||
                randomAnyAgent == "Iso"
            ) {
                val imageResourceId5 = resources.getIdentifier(imageName5, "drawable", packageName)
                agentimage5.setImageResource(imageResourceId5)
                positionimage5.setImageResource(R.drawable.duelist)
                positionName5.text = "Duelist"
            } else if (randomAnyAgent == "Breach" || randomAnyAgent == "Sova" || randomAnyAgent == "Skye"
                || randomAnyAgent == "Kayo" || randomAnyAgent == "Fade" || randomAnyAgent == "Gekko"
            ) {
                val imageResourceId5 = resources.getIdentifier(imageName5, "drawable", packageName)
                agentimage5.setImageResource(imageResourceId5)
                positionimage5.setImageResource(R.drawable.initiator)
                positionName5.text = "Initiator"
            } else if (randomAnyAgent == "Sage" || randomAnyAgent == "Cypher" || randomAnyAgent == "Killjoy"
                || randomAnyAgent == "Chamber" || randomAnyAgent == "Deadlock"
            ) {
                val imageResourceId5 = resources.getIdentifier(imageName5, "drawable", packageName)
                agentimage5.setImageResource(imageResourceId5)
                positionimage5.setImageResource(R.drawable.sentinel)
                positionName5.text = "Sentinel"
            }



        again.setOnClickListener {
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

                    agentname1.text = randomControllerAgent
                    val imageName1 = when (randomControllerAgent) {
                        "Omen" -> "omen"
                        "Brimstone" -> "brimstone"
                        "Viper" -> "viper"
                        "Astra" -> "astra"
                        "Harbor" -> "harbor"
                        else -> ""
                    }
                    val imageResourceId1 =
                        resources.getIdentifier(imageName1, "drawable", packageName)
                    agentimage1.setImageResource(imageResourceId1)
                    positionimage1.setImageResource(R.drawable.controller)
                    positionName1.text = "Controller"

                    //Duelist
                    agentname2.text = randomDuelistAgent
                    val imageName2 = when (randomDuelistAgent) {
                        "Jett" -> "jett"
                        "Raze" -> "raze"
                        "Phoenix" -> "phoenix"
                        "Reyna" -> "reyna"
                        "Yoru" -> "yoru"
                        "Neon" -> "neon"
                        "Iso" -> "iso"
                        else -> ""
                    }
                    val imageResourceId2 =
                        resources.getIdentifier(imageName2, "drawable", packageName)
                    agentimage2.setImageResource(imageResourceId2)
                    positionimage2.setImageResource(R.drawable.duelist)
                    positionName2.text = "Duelist"

                    //Initiator
                    agentname3.text = randomInitiatorAgent
                    val imageName3 = when (randomInitiatorAgent) {
                        "Breach" -> "breach"
                        "Sova" -> "sova"
                        "Skye" -> "skye"
                        "Kayo" -> "kayo"
                        "Fade" -> "fade"
                        "Gekko" -> "gekko"
                        else -> ""
                    }
                    val imageResourceId3 =
                        resources.getIdentifier(imageName3, "drawable", packageName)
                    agentimage3.setImageResource(imageResourceId3)
                    positionimage3.setImageResource(R.drawable.initiator)
                    positionName3.text = "Initiator"

                    //Sentinel
                    agentname4.text = randomSentinelAgent
                    val imageName4 = when (randomSentinelAgent) {
                        "Sage" -> "sage"
                        "Cypher" -> "cypher"
                        "Killjoy" -> "killjoy"
                        "Chamber" -> "chamber"
                        "Deadlock" -> "deadlock"
                        else -> ""
                    }
                    val imageResourceId4 =
                        resources.getIdentifier(imageName4, "drawable", packageName)
                    agentimage4.setImageResource(imageResourceId4)
                    positionimage4.setImageResource(R.drawable.sentinel)
                    positionName4.text = "Sentinel"

                    //AnyAgent(ที่ยังไม่ถูกสุ่ม)
                    agentname5.text = randomAnyAgent
                    val imageName5 = when (randomAnyAgent) {
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
                    if (randomAnyAgent == "Omen" || randomAnyAgent == "Brimstone" || randomAnyAgent == "Viper"
                        || randomAnyAgent == "Astra" || randomAnyAgent == "Harbor"
                    ) {
                        val imageResourceId5 =
                            resources.getIdentifier(imageName5, "drawable", packageName)
                        agentimage5.setImageResource(imageResourceId5)
                        positionimage5.setImageResource(R.drawable.controller)
                        positionName5.text = "Controller"
                    } else if (randomAnyAgent == "Jett" || randomAnyAgent == "Raze" || randomAnyAgent == "Phoenix"
                        || randomAnyAgent == "Reyna" || randomAnyAgent == "Yoru" || randomAnyAgent == "Neon" ||
                        randomAnyAgent == "Iso"
                    ) {
                        val imageResourceId5 =
                            resources.getIdentifier(imageName5, "drawable", packageName)
                        agentimage5.setImageResource(imageResourceId5)
                        positionimage5.setImageResource(R.drawable.duelist)
                        positionName5.text = "Duelist"
                    } else if (randomAnyAgent == "Breach" || randomAnyAgent == "Sova" || randomAnyAgent == "Skye"
                        || randomAnyAgent == "Kayo" || randomAnyAgent == "Fade" || randomAnyAgent == "Gekko"
                    ) {
                        val imageResourceId5 =
                            resources.getIdentifier(imageName5, "drawable", packageName)
                        agentimage5.setImageResource(imageResourceId5)
                        positionimage5.setImageResource(R.drawable.initiator)
                        positionName5.text = "Initiator"
                    } else if (randomAnyAgent == "Sage" || randomAnyAgent == "Cypher" || randomAnyAgent == "Killjoy"
                        || randomAnyAgent == "Chamber" || randomAnyAgent == "Deadlock"
                    ) {
                        val imageResourceId5 =
                            resources.getIdentifier(imageName5, "drawable", packageName)
                        agentimage5.setImageResource(imageResourceId5)
                        positionimage5.setImageResource(R.drawable.sentinel)
                        positionName5.text = "Sentinel"
                    }
                }
            }
        }

        record.setOnClickListener {
            val intent = Intent(this, TeamRecord::class.java)
            intent.putExtra("randomControllerAgent", randomControllerAgent)
            intent.putExtra("randomDuelistAgent", randomDuelistAgent)
            intent.putExtra("randomInitiatorAgent", randomInitiatorAgent)
            intent.putExtra("randomSentinelAgent", randomSentinelAgent)
            intent.putExtra("randomAnyAgent", randomAnyAgent)
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