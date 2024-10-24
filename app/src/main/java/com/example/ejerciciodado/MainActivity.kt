package com.example.ejerciciodado

import android.os.Bundle
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


        val diceRange: IntRange = 1..6

        val randomNumber: Int = diceRange.random()

        mostrar_mensaje("$randomNumber")

        val myFirstDice = Dice()

        mostrar_mensaje("${myFirstDice.roll()}")

        val mySecondDice = Dice(20)

        mostrar_mensaje("${mySecondDice.roll()}")




    }
}