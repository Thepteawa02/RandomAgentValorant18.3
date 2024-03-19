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
            findViewById(R.id.check_Rayna),
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

        val agentNames = listOf(
            "Jett", "Raze", "Breach", "Omen", "Brimstone", "Phoenix", "Sage",
            "Sova", "Viper", "Cypher", "Rayna", "Killjoy", "Skye", "Yoru", "Astra",
            "Kayo", "Chamber", "Neon", "Fade", "Harbor", "Gekko", "Deadlock", "Iso"
        )

        agentcheck.forEachIndexed { index, checkBox ->
            checkBox.text = agentNames[index]
        }

        val controller: CheckBox = findViewById(R.id.controller)
        val duelist: CheckBox = findViewById(R.id.duelist)
        val initiator: CheckBox = findViewById(R.id.initiator)
        val sentinel: CheckBox = findViewById(R.id.sentinel)

        val selectedAgent = agentcheck.filter { it.isChecked }

        random.setOnClickListener {
            val unselectedAgent = agentcheck.filter { !it.isChecked }

            if (selectedAgent.size > 1) {
                val randomIndex = Random.nextInt(unselectedAgent.size)
                val randomAgent = unselectedAgent[randomIndex].text.toString()
                val intent = Intent(this, ResultSingleRandom::class.java)
                intent.putExtra("randomAgent", randomAgent)
                startActivity(intent)
                finish()
            } else {
                val randomIndex = Random.nextInt(unselectedAgent.size)
                val randomAgent = unselectedAgent[randomIndex].text.toString()
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