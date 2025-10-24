package com.example.aplicacion.componentes.explicacionClase

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyVerticalLayout(modifier: Modifier = Modifier) {
    Column( // Contenedor vertical
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally // Centra horizontalmente el contenido
    ) {
        // Título
        Text(
            text = "TextView (Título)",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color(0xFFADD8E6)) // azul claro
                .padding(10.dp)
        )

        // Fila de botones
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color(0xFF2196F3)), // fondo azul
            horizontalArrangement = Arrangement.SpaceEvenly // reparte los botones
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
            ) {
                Text("Boton1")
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
            ) {
                Text("Boton2")
            }
        }

        // Créditos
        Text(
            text = "TextView2 (Créditos)",
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color(0xFF9370DB)) // violeta
                .padding(10.dp)
        )
    }
}
