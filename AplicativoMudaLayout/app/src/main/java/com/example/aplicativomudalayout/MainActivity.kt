package com.example.aplicativomudalayout

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

        var animal : Animal
        var cao = Cao()
        var gato = Gato()
        var rato = Rato()

        animal = cao
        println(animal.tipo())
        println(animal.come())
        println(animal.som())
        println ("\n\n\n")

        animal = gato
        println(animal.tipo())
        println(animal.come())
        println(animal.som())
        println ("\n\n\n")

        animal = rato
        println(animal.tipo())
        println(animal.come())
        println(animal.som())
        println ("\n\n\n")

        val animais = mutableListOf<Animal> (
            Cao(), Gato(), Rato())

        animais.add(Cao())
        animais.add(Gato())
        animais.add(Rato())

        animais.forEach(){
            println("Este animal é um ${it.tipo()}")
            println("Ele como ${it.come()}")
            println("E faz o seguinte som ${it.som()}")
            println ("\n")
        }


    }
}