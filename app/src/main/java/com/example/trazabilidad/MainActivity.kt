package com.example.trazabilidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  botonlogin = findViewById<Button>(R.id.botonlogin)
        botonlogin.setOnClickListener{
    val changepage = Intent(this,home::class.java)

    startActivity(changepage)
    }

}
        }




