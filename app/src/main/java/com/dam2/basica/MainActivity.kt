package com.dam2.basica
import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        botonsaludo.setOnClickListener {
            textoSaludo.setText("Hola que tal")//introduce el texto en el textview

        }

        tostada.setOnClickListener {
            toast("HOLA!!!")//toast el mensaje
            it.snackbar("MUEREEEEEEEEEEEE")//snackbar con el mensaje
        }


    }


    fun cambiarMensaje(v:View){//cambia el mensaje del textview e introduce la hora, probando crear funcion y asignarle el on click listener desde el contain main
        val formato=SimpleDateFormat("HH:mm:ss")
        val fechaActual= Calendar.getInstance().getTime()
        val string= formato.format(fechaActual)
        textoSaludo.setText("La hora es "+string)
    }

    fun cambiarRojo(v: View) {//cambiar a rojo el textview de la otra ativity
        startActivity(intentFor<CambiarColores>("color" to "ROJO"))
    }

    fun cambiarAmarillo(v: View) {//cambiar a amaarillo el textview de la otra activity
        startActivity(intentFor<CambiarColores>("color" to "AMARILLO"))
    }

    fun iraInternet(v: View) {//utilizamos el browse para abrir un enlace al pulsar el boton
        browse("https://euw.leagueoflegends.com/es/")
    }






    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
