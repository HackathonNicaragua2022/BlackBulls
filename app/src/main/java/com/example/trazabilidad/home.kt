package com.example.trazabilidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)


        val  botoninfotmacion = findViewById<Button>(R.id.banimal)
        botoninfotmacion.setOnClickListener{
            val changepage2 = Intent(this,MainActivity3::class.java)

            startActivity(changepage2)





            }
        val  banimal = findViewById<Button>(R.id.bregistro)
        banimal.setOnClickListener{
            val changepage3 = Intent(this,MainActivity2::class.java)

            startActivity(changepage3)
        }

    }
        }


