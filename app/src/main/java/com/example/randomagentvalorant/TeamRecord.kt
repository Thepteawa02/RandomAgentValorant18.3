package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TeamRecord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_record)

        val back: Button = findViewById(R.id.back)

        val teamimg11: ImageView = findViewById(R.id.teamimg11)
        val teamimg12: ImageView = findViewById(R.id.teamimg12)
        val teamimg13: ImageView = findViewById(R.id.teamimg13)
        val teamimg14: ImageView = findViewById(R.id.teamimg14)
        val teamimg15: ImageView = findViewById(R.id.teamimg15)

        val teamname11: TextView = findViewById(R.id.teamname11)
        val teamname12: TextView = findViewById(R.id.teamname12)
        val teamname13: TextView = findViewById(R.id.teamname13)
        val teamname14: TextView = findViewById(R.id.teamname14)
        val teamname15: TextView = findViewById(R.id.teamname15)

        val teamno1: TextView = findViewById(R.id.team1)

        val teamimg21: ImageView = findViewById(R.id.teamimg21)
        val teamimg22: ImageView = findViewById(R.id.teamimg22)
        val teamimg23: ImageView = findViewById(R.id.teamimg23)
        val teamimg24: ImageView = findViewById(R.id.teamimg24)
        val teamimg25: ImageView = findViewById(R.id.teamimg25)

        val teamname21: TextView = findViewById(R.id.teamname21)
        val teamname22: TextView = findViewById(R.id.teamname22)
        val teamname23: TextView = findViewById(R.id.teamname23)
        val teamname24: TextView = findViewById(R.id.teamname24)
        val teamname25: TextView = findViewById(R.id.teamname25)

        val teamno2: TextView = findViewById(R.id.team2)

        val teamimg31: ImageView = findViewById(R.id.teamimg31)
        val teamimg32: ImageView = findViewById(R.id.teamimg32)
        val teamimg33: ImageView = findViewById(R.id.teamimg33)
        val teamimg34: ImageView = findViewById(R.id.teamimg34)
        val teamimg35: ImageView = findViewById(R.id.teamimg35)

        val teamname31: TextView = findViewById(R.id.teamname31)
        val teamname32: TextView = findViewById(R.id.teamname32)
        val teamname33: TextView = findViewById(R.id.teamname33)
        val teamname34: TextView = findViewById(R.id.teamname34)
        val teamname35: TextView = findViewById(R.id.teamname35)

        val teamno3: TextView = findViewById(R.id.team3)

        val teamimg41: ImageView = findViewById(R.id.teamimg41)
        val teamimg42: ImageView = findViewById(R.id.teamimg42)
        val teamimg43: ImageView = findViewById(R.id.teamimg43)
        val teamimg44: ImageView = findViewById(R.id.teamimg44)
        val teamimg45: ImageView = findViewById(R.id.teamimg45)

        val teamname41: TextView = findViewById(R.id.teamname41)
        val teamname42: TextView = findViewById(R.id.teamname42)
        val teamname43: TextView = findViewById(R.id.teamname43)
        val teamname44: TextView = findViewById(R.id.teamname44)
        val teamname45: TextView = findViewById(R.id.teamname45)

        val teamno4: TextView = findViewById(R.id.team4)

        val teamimg51: ImageView = findViewById(R.id.teamimg51)
        val teamimg52: ImageView = findViewById(R.id.teamimg52)
        val teamimg53: ImageView = findViewById(R.id.teamimg53)
        val teamimg54: ImageView = findViewById(R.id.teamimg54)
        val teamimg55: ImageView = findViewById(R.id.teamimg55)

        val teamname51: TextView = findViewById(R.id.teamname51)
        val teamname52: TextView = findViewById(R.id.teamname52)
        val teamname53: TextView = findViewById(R.id.teamname53)
        val teamname54: TextView = findViewById(R.id.teamname54)
        val teamname55: TextView = findViewById(R.id.teamname55)

        val teamno5: TextView = findViewById(R.id.team5)

        val randomControllerAgent = intent.getStringExtra("randomControllerAgent")
        val randomDuelistAgent = intent.getStringExtra("randomDuelistAgent")
        val randomInitiatorAgent = intent.getStringExtra("randomInitiatorAgent")
        val randomSentinelAgent = intent.getStringExtra("randomSentinelAgent")
        val randomAnyAgent = intent.getStringExtra("randomAnyAgent")

        val img11 = when (randomControllerAgent) {
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
        val image11 = resources.getIdentifier(img11, "drawable", packageName)
        teamimg11.setImageResource(image11)
        teamname11.text = randomControllerAgent

        val img12 = when (randomDuelistAgent) {
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
        val image12 = resources.getIdentifier(img12, "drawable", packageName)
        teamimg12.setImageResource(image12)
        teamname12.text = randomDuelistAgent

        val img13 = when (randomInitiatorAgent) {
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
        val image13 = resources.getIdentifier(img13, "drawable", packageName)
        teamimg13.setImageResource(image13)
        teamname13.text = randomInitiatorAgent

        val img14 = when (randomSentinelAgent) {
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
        val image14 = resources.getIdentifier(img14, "drawable", packageName)
        teamimg14.setImageResource(image14)
        teamname14.text = randomSentinelAgent

        val img15 = when (randomAnyAgent) {
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
        val image15 = resources.getIdentifier(img15, "drawable", packageName)
        teamimg15.setImageResource(image15)
        teamname15.text = randomAnyAgent
        teamno1.text = "1"


        back.setOnClickListener {
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