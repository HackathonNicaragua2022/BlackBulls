package com.example.trazabilidad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import com.example.trazabilidad.databinding.ActivityHlobbyBinding


class hlobby : AppCompatActivity() {
    private lateinit var binding: ActivityHlobbyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHlobbyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val  botonidfa = findViewById<Button>(R.id.btnida)
        botonidfa.setOnClickListener{
            val changepage1 = Intent(this,qrscanner::class.java)

            startActivity(changepage1)

        }
        val  botonrf = findViewById<Button>(R.id.btnrf)
        botonrf.setOnClickListener{
            val changepage3 = Intent(this,registrof::class.java)

            startActivity(changepage3)
        }
        val  botoninfotmacion = findViewById<Button>(R.id.btngif)
        botoninfotmacion.setOnClickListener{
            val changepage2 = Intent(this,hginfo::class.java)

            startActivity(changepage2)


        }
    }
    }
