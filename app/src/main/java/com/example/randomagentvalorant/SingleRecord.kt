package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SingleRecord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_record)

        val agentimg1: ImageView = findViewById(R.id.agentimg1)
        val agentname1: TextView = findViewById(R.id.agentname1)
        val agentimg2: ImageView = findViewById(R.id.agentimg2)
        val agentname2: TextView = findViewById(R.id.agentname2)
        val agentimg3: ImageView = findViewById(R.id.agentimg3)
        val agentname3: TextView = findViewById(R.id.agentname3)
        val agentimg4: ImageView = findViewById(R.id.agentimg4)
        val agentname4: TextView = findViewById(R.id.agentname4)
        val agentimg5: ImageView = findViewById(R.id.agentimg5)
        val agentname5: TextView = findViewById(R.id.agentname5)

        val back: Button = findViewById(R.id.back)

        val randomAgent = intent.getStringExtra("randomAgent")

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
        val imageResourceId1 = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg1.setImageResource(imageResourceId1)
        agentname1.text = randomAgent

        val imageName2 = when (randomAgent) {
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
        val imageResourceId2 = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg2.setImageResource(imageResourceId2)
        agentname2.text = randomAgent

        val imageName3 = when (randomAgent) {
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
        val imageResourceId3 = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg3.setImageResource(imageResourceId3)
        agentname3.text = randomAgent

        val imageName4 = when (randomAgent) {
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
        val imageResourceId4 = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg4.setImageResource(imageResourceId4)
        agentname4.text = randomAgent

        val imageName5 = when (randomAgent) {
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
        val imageResourceId5 = resources.getIdentifier(imageName, "drawable", packageName)
        agentimg5.setImageResource(imageResourceId5)
        agentname5.text = randomAgent

        back.setOnClickListener {
            val intent = Intent(this, SingleRandom::class.java)
            startActivity(intent)
            finish()
        }


    }
}