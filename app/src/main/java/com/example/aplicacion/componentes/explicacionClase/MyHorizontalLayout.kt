package com.example.aplicacion.componentes.explicacionClase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyHorizontalLayout(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.padding(16.dp)
    ) {
        Button(onClick = {}) {
            Text("Boton1")
        }
        Button(onClick = {}) {
            Text("Boton2")
        }
        Text(text = "TextView2 (Créditos)")
    }
}

@Preview(showBackground = true)
@Composable
fun MyHorizontalLayoutPreview() {
    MyHorizontalLayout()
}
