package com.example.gav_userint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonFood: Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonFood = findViewById(R.id.bt_next)

        ButtonFood!!.setOnClickListener {
            val intent = Intent(this,Food_activity::class.java)
            startActivity(intent)
        }
    }
}