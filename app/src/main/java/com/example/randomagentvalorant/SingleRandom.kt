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

        val controller: CheckBox = findViewById(R.id.controller)
        val duelist: CheckBox = findViewById(R.id.duelist)
        val initiator: CheckBox = findViewById(R.id.initiator)
        val sentinel: CheckBox = findViewById(R.id.sentinel)

        val controllerAgent = listOf("Omen", "Brimstone", "Viper", "Astra", "Harbor")
        val duelistAgent = listOf("Jett", "Raze", "Phoenix", "Reyna", "Yoru", "Neon", "Iso")
        val initiatorAgent = listOf("Breach", "Sova", "Skye", "Kayo", "Fade", "Gekko")
        val sentinelAgent = listOf("Sage", "Cypher", "Killjoy", "Chamber", "Deadlock")

        random.setOnClickListener {
            //ฟังก์ชันสุ่มตัว Controller
            if (agentcheck.isNotEmpty() && controller.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else if (agentcheck.isEmpty() && controller.isChecked) {

                agentNames.retainAll(controllerAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } // ฟังก์ชันสุ่มตัว Duelist
            else  if (agentcheck.isNotEmpty() && duelist.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(duelistAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else if (agentcheck.isEmpty() && duelist.isChecked) {

                agentNames.retainAll(duelistAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } // ฟังก์ชันสุ่มตัว Initiator
            else  if (agentcheck.isNotEmpty() && initiator.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(initiatorAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else if (agentcheck.isEmpty() && initiator.isChecked) {

                agentNames.retainAll(initiatorAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } // ฟังก์ชันสุ่มตัว Sentinel
            else  if (agentcheck.isNotEmpty() && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(sentinelAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else if (agentcheck.isEmpty() && sentinel.isChecked) {

                agentNames.retainAll(sentinelAgent)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else if (agentcheck.isNotEmpty()) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else {
                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }
        }

        back.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
        }
    }
}