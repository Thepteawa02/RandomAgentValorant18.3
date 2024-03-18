package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SingleRecord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_record)

        val back: Button = findViewById(R.id.back)

        back.setOnClickListener {
            val intent = Intent(this, ResultSingleRandom::class.java)
            startActivity(intent)
            finish()
        }


    }
}