package com.example.qta_jdb_8

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Encuentra el botón por su ID
        val iniciarSesionButton: Button = findViewById(R.id.iniciarsesion_main)

        // Establece un OnClickListener para el botón
        iniciarSesionButton.setOnClickListener {
            // Crea un Intent para iniciar la actividad IniciarSesion
            val intent = Intent(this, iniciarsesion::class.java)
            startActivity(intent)
        }
    }
}
