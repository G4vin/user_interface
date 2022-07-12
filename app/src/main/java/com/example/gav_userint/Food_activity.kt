package com.example.gav_userint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food_activity : AppCompatActivity() {
    var ButtonChange: Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        ButtonChange = findViewById(R.id.bt_change)

        ButtonChange!!.setOnClickListener {
            val intent = Intent(this,Change_food::class.java)
            startActivity(intent)
        }
    }
}