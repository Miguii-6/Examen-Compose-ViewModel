package com.example.examenpmdm.ui.theme

import android.util.Log
import android.widget.Button
import androidx.compose.foundation.border
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examenpmdm.R


@Composable
fun Botons(miModel :Model) {
    Column(
        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )

        {
            FilledTonalButton(onClick = { miModel.randomLista() }) {
                Text(text = "vermello")

            }
            Spacer(modifier = Modifier.width(15.dp))
            OutlinedButton(onClick = { miModel.random() }) {
                Text(text = "amarillo")

            }

        }
        Row {

            Spacer(modifier = Modifier.height(50.dp))
            ElevatedButton(onClick = { /*TODO*/ }) {
                Text(text = "verde")
            }

            Spacer(modifier = Modifier.width(15.dp))
            ElevatedButton(onClick = { /*TODO*/ }) {
                Text(text = "azul")
            }
        }
        Row {
            FilledTonalButton(onClick = { miModel.reset() }) {
                Text(text = "Start")
            }
            Spacer(modifier = Modifier.width(15.dp))
            FilledTonalButton(onClick = { miModel.setContador() }) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = "-->",
                    modifier = Modifier
                        .size(30.dp)
                        .offset(y = 80.dp)
                        .offset(x = 70.dp)
                )
                Text(text = "-->")
            }
        }

    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ronda(miModel: Model) {
        Column(
            modifier = Modifier.fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Ronda")

            val contador = miModel.getContador()
            val fontSize = 10.sp * ((contador / 10) + 1)
            OutlinedTextField(
                value = contador.toString(),
                onValueChange = { },
                modifier = Modifier
                    .padding(15.dp)
                    .width(150.dp),
                textStyle = LocalTextStyle.current.copy(fontSize = fontSize)
            )

            Row {
                Botons(miModel = miModel)
            }

        }
    }

    @Composable
    fun Greeting(miModel: Model) {
        Column {
            //Botons(miModel = miModel )
            ronda(miModel = miModel)
            Spacer(modifier = Modifier.height(50.dp))
            //Texto(miModel = miModel)
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}
