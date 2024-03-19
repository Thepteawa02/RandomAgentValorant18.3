package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.random.Random

class SingleRandom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_random)

        val random: Button = findViewById(R.id.random)
        val back: Button = findViewById(R.id.back)

        val agentcheck = listOf<CheckBox>(
            findViewById(R.id.check_Jett),
            findViewById(R.id.check_Raze),
            findViewById(R.id.check_Breach),
            findViewById(R.id.check_Omen),
            findViewById(R.id.check_Brimstone),
            findViewById(R.id.check_Phoenix),
            findViewById(R.id.check_Sage),
            findViewById(R.id.check_Sova),
            findViewById(R.id.check_Viper),
            findViewById(R.id.check_Cypher),
            findViewById(R.id.check_Reyna),
            findViewById(R.id.check_Killjoy),
            findViewById(R.id.check_Skye),
            findViewById(R.id.check_Yoru),
            findViewById(R.id.check_Astra),
            findViewById(R.id.check_Kayo),
            findViewById(R.id.check_Chamber),
            findViewById(R.id.check_Neon),
            findViewById(R.id.check_Fade),
            findViewById(R.id.check_Harbor),
            findViewById(R.id.check_Gekko),
            findViewById(R.id.check_Deadlock),
            findViewById(R.id.check_Iso)
        )

        val agentNames = mutableListOf(
            "Jett", "Raze", "Breach", "Omen", "Brimstone", "Phoenix", "Sage",
            "Sova", "Viper", "Cypher", "Reyna", "Killjoy", "Skye", "Yoru", "Astra",
            "Kayo", "Chamber", "Neon", "Fade", "Harbor", "Gekko", "Deadlock", "Iso"
        )

        agentcheck.forEachIndexed { index, checkBox ->
            checkBox.text = agentNames[index]
        }

//        val controller: CheckBox = findViewById(R.id.controller)
//        val duelist: CheckBox = findViewById(R.id.duelist)
//        val initiator: CheckBox = findViewById(R.id.initiator)
//        val sentinel: CheckBox = findViewById(R.id.sentinel)
//
//        val controllerCharacters = listOf("Omen", "Brimstone", "Viper", "Astra", "Harbor")
//        val duelistCharacters = listOf("Jett", "Raze", "Phoenix", "Reyna", "Yoru", "Neon", "Iso")
//        val initiatorCharacters = listOf("Breach", "Sova", "Skye", "Kayo", "Fade", "Gekko")
//        val sentinelCharacters = listOf("Sage", "Cypher", "Killjoy", "Chamber", "Deadlock")
//
//        controller.text = "Controller"
//        controllerCharacters.forEach { character ->
//            val checkBox = CheckBox(this)
//            checkBox.text = character
//        }
//
//        duelist.text = "Duelist"
//        duelistCharacters.forEach { character ->
//            val checkBox = CheckBox(this)
//            checkBox.text = character
//        }
//
//        initiator.text = "Initiator"
//        initiatorCharacters.forEach { character ->
//            val checkBox = CheckBox(this)
//            checkBox.text = character
//        }
//
//        sentinel.text = "Sentinel"
//        sentinelCharacters.forEach { character ->
//            val checkBox = CheckBox(this)
//            checkBox.text = character
//        }

        random.setOnClickListener {
//            val possibleCharacters = when {
//                controller.isChecked -> controllerCharacters
//                duelist.isChecked -> duelistCharacters
//                initiator.isChecked -> initiatorCharacters
//                sentinel.isChecked -> sentinelCharacters
//                else -> agentNames
//            }

            if (agentcheck.isNotEmpty()) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                selectedAgents.forEach { checkBox ->
                    val agentName = checkBox.text.toString()
                    agentNames.remove(agentName)
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else if (agentcheck.isEmpty()){
                val randomIndex = Random.nextInt(agentNames.size)
                val randomAgent = agentNames[randomIndex]
                val intent = Intent(this, ResultSingleRandom::class.java)
                intent.putExtra("randomAgent", randomAgent)
                startActivity(intent)
                finish()
            }
        }


        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}