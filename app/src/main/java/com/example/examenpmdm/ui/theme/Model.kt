package com.example.examenpmdm.ui.theme

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


//esta clase extende do VIEW Model

class Model():ViewModel() {
    //Poñemos os datos


    var nome = mutableStateOf("")

    //declarar a variable random

    var random = mutableStateOf(0)

    var lista = mutableStateListOf<Int>()
    fun random() {
        random.value = ((0..10).random())
        Log.d("Estado", random.value.toString())
    }

    fun randomLista() {
        random.value = ((0..8).random())
        lista.add(random.value)
        Log.d("Estado", "Nuemros Lista: " + random.value.toString())
    }

    fun getLista(): List<Int> {
        return lista.toList() //si non poñemos o toList, devolve as direccions de memoria
    }

    //así facemos que devolva algo
    fun getRandom(): Int {
        return random.value
    }

    fun getNombre(): String {
        return nome.value
    }
//Cambio para o examen, cun contador

    var contador by mutableStateOf(Contador(0))

    /**
    Accedemos a instancia valor de contador e lle sumamos un
    esto se almacena no contador
     */
    fun setContador() {
        contador = Contador(contador.valor + 1)
    }

    fun getContador(): Int {
        return contador.valor
    }

    fun reset() {
        contador = Contador(0)

    }
}