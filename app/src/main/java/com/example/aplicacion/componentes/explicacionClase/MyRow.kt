package com.example.aplicacion.componentes.explicacionClase

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyRow(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {
        // Título arriba
        Text(
            text = "Horizontal LinearLayout",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Contenedor con borde azul
        Box(
            modifier = Modifier
                .border(2.dp, Color.Blue) // borde azul
                .padding(8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.Bottom, // alinea las cajas al fondo como en LinearLayout
                horizontalArrangement = Arrangement.spacedBy(8.dp), // espacios entre cajas
                modifier = Modifier.padding(8.dp)
            ) {
                // Caja 1
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(150.dp)
                        .background(Color.Magenta),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "View", color = Color.Black)
                }

                // Caja 2
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(200.dp)
                        .background(Color.Magenta),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "View", color = Color.Black)
                }

                // Caja 3
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(150.dp)
                        .background(Color.Magenta),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "View", color = Color.Black)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyRowPreview() {
    MyRow()
}
