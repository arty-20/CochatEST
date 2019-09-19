package com.example.cochatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton_true = findViewById<Button>(R.id.verdad_button)
        val boton_false = findViewById<Button>(R.id.falso_button)

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
