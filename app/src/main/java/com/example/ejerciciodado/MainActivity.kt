package com.example.ejerciciodado

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val imagen:ImageView = findViewById(R.id.imagenDado)
        val texto: TextView = findViewById(R.id.textoNumero)
        val boton: Button = findViewById(R.id.botonTirarDado)

        boton.setOnClickListener {
            val tirada : Int = Dice().roll()

            texto.text = "$tirada"

            when (tirada) {
                1 -> imagen.setBackgroundResource(R.drawable.dice_1)
                2 -> imagen.setBackgroundResource(R.drawable.dice_2)
                3 -> imagen.setBackgroundResource(R.drawable.dice_3)
                4 -> imagen.setBackgroundResource(R.drawable.dice_4)
                5 -> imagen.setBackgroundResource(R.drawable.dice_5)
                6 -> imagen.setBackgroundResource(R.drawable.dice_6)

            }

            /**
             * BUSCAR COMO SE HACE
             * imagen.setBackgroundResource(R.drawable.dice_"$tirada")
             */

        }

//        val diceRange: IntRange = 1..6
//
//        val randomNumber: Int = diceRange.random()
//
//        mostrar_mensaje("$randomNumber")
//
//        val myFirstDice = Dice()
//
//        mostrar_mensaje("${myFirstDice.roll()}")
//
//        val mySecondDice = Dice(20)
//
//        mostrar_mensaje("${mySecondDice.roll()}")




    }
}