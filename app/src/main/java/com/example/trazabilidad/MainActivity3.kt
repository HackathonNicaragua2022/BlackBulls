package com.example.trazabilidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val  botonlogin = findViewById<Button>(R.id.botonlogin)
        botonlogin.setOnClickListener{
            val changepage = Intent(this,home::class.java)

            startActivity(changepage)
        }

    }
}

