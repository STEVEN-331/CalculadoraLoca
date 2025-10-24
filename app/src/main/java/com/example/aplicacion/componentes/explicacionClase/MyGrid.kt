package com.example.aplicacion.componentes.explicacionClase

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun MyGrid(modifier: Modifier = Modifier) { // Función que dibuja el grid 2x3
    Column( // Contenedor vertical (3 filas)
        modifier = modifier.fillMaxSize()
    ) {
        // Fila 1
        Row(modifier = Modifier.weight(1f)) {
            ColoredBox("Indigo", Color(0xFF3F51B5), Modifier.weight(1f))
            ColoredBox("Pink", Color(0xFFE91E63), Modifier.weight(1f))
        }
        // Fila 2
        Row(modifier = Modifier.weight(1f)) {
            ColoredBox("Orange", Color(0xFFFF9800), Modifier.weight(1f))
            ColoredBox("Green", Color(0xFF4CAF50), Modifier.weight(1f))
        }
        // Fila 3
        Row(modifier = Modifier.weight(1f)) {
            ColoredBox("Grey", Color(0xFF9E9E9E), Modifier.weight(1f))
            ColoredBox("Cyan", Color(0xFF00BCD4), Modifier.weight(1f))
        }
    }
}

// Reutilizamos un componente para no repetir código
@Composable
fun ColoredBox(text: String, color: Color, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color),
        contentAlignment = Alignment.Center // centra el texto
    ) {
        Text(
            text = text,
            fontSize = 20.sp,
            color = Color.White
        )
    }
}
