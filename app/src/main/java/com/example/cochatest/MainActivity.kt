package com.example.cochatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.InputEvent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton_true = findViewById<Button>(R.id.verdad_button)
        val boton_false = findViewById<Button>(R.id.falso_button)

        val boton_siguiente = findViewById<Button>(R.id.siguiente)
        val boton_anterior = findViewById<Button>(R.id.anterior)
        val preguntas:List<String> = listOf("pregunta 1","pregunta 2","pregunta 3")
        var cont = 0

        val texto = findViewById<TextView>(R.id.texto_pre)

        boton_siguiente.setOnClickListener{
            if(cont < preguntas.size-1) {
                cont++
                texto.text = preguntas.get(cont)
            }
        }
        boton_anterior.setOnClickListener{
            if(cont > 0) {
                cont--;
                texto.text = preguntas.get(cont)
            }
        }

        boton_true.setOnClickListener {
            val t = Toast.makeText(this, "Presiono el boton de verdad", Toast.LENGTH_SHORT)
            t.setGravity(Gravity.TOP,0,0)
            t.show()
        }
        boton_false.setOnClickListener {
            val t = Toast.makeText(this, "Presiono el boton de falso", Toast.LENGTH_SHORT)
            t.setGravity(Gravity.TOP,0,0)
            t.show()
        }
    }
}
