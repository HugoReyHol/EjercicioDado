package com.example.ejerciciodado

class Dice(val sides: Int = 6) {


    fun roll(): Int {
        return (1..sides).random()

    }
}