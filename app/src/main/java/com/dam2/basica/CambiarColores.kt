package com.dam2.basica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_cambiar_colores.*

class CambiarColores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_colores)

        val valor = intent.getStringExtra("color")


        when (valor) {
            "AMARILLO" -> {//cambia el fondo del textview a amarillo
                textoColores.setBackgroundResource(R.color.amarillo)
                textoColores.setText(valor)
                }


             "ROJO" -> {//cambia el fondo del textview a rojo
                  textoColores.setBackgroundResource(R.color.rojo)
                  textoColores.setText(valor)
                  }
        }
      }

    

    fun volver(v: View){//cierra la activity y volvemos a la main activity
        finish()
    }


}
