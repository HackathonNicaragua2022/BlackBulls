package com.example.trazabilidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class perfila : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfila)
        val btnrhome = findViewById<ImageButton>(R.id.btmregresar)
        btnrhome.setOnClickListener{
            val bthome = Intent(this,home::class.java)
        }

    }
}