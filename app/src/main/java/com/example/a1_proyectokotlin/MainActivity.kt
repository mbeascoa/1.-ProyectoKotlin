package com.example.a1_proyectokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//para usar esta librería anterior se debe instalar en el gradle a nivel de moculo de aplicación
// la libreria dentro de pluggin  id 'kotlin-android-extensions

//Bundle?  es para decir que la variable Bundle puede permitir nulos
//Ojo se ve que no tienen puntos y comas al final de la sentencia

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtMensaje.text = "Bienvenido a la pantalla de inicio"

        btnMostrar.setOnClickListener {
            txtMensaje.text ="Has pulsado el Botón"
        }
    }
}