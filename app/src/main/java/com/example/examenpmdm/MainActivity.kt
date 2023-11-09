package com.example.examenpmdm

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.examenpmdm.ui.theme.Botons
import com.example.examenpmdm.ui.theme.Model
import com.example.examenpmdm.ui.theme.ExamenPMDMTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val miModel : Model = Model()
        setContent {
            ExamenPMDMTheme {
                // A surface pilla o color de fondo do theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Botons(miModel = miModel)
                }
            }
        }
    }

    //funcions
    val TAG: String = "Estado"
    var tiempoInicio: Long = 0
    var tiempoFin : Long = 0

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Funcion onStart")
        tiempoInicio = System.currentTimeMillis()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Funcion onPause")
        tiempoFin = System.currentTimeMillis()
        tiempoFin -= tiempoInicio
        tiempoFin = tiempoFin /1000
        Log.d(TAG,"O tempo entre o star e a pausa e de:" + tiempoFin + " segs")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Funcion onResume")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Funcion onSTop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Funcion onDestroy")
    }

}
