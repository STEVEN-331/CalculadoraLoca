package com.example.aplicacion.componentes.explicacionClase // El archivo está en el paquete "componentes" de tu app

import androidx.compose.foundation.background // Para poner un color de fondo en un componente
import androidx.compose.foundation.layout.Box // Contenedor en Compose (como un div en HTML)
import androidx.compose.foundation.layout.fillMaxSize // Hace que el componente ocupe toda la pantalla
import androidx.compose.foundation.layout.width // Modificador para dar un ancho fijo
import androidx.compose.foundation.layout.height // Modificador para dar una altura fija
import androidx.compose.runtime.Composable // Permite crear funciones de UI
import androidx.compose.ui.Alignment // Para alinear elementos dentro de Box
import androidx.compose.ui.Modifier // Modificador: personaliza los componentes
import androidx.compose.ui.graphics.Color // Colores predefinidos en Compose
import androidx.compose.ui.unit.dp // Unidad de medida en Compose (dp = densidad independiente de píxeles)

@Composable
fun MyBox(modifier: Modifier = Modifier) { // Función que dibuja una caja grande con otra caja adentro
    Box( // Caja externa
        modifier = Modifier
            .fillMaxSize() // La caja roja ocupará toda la pantalla
            .background(Color.Red), // Fondo rojo para la caja externa
        contentAlignment = Alignment.Center // Todo lo que esté dentro estará centrado
    ) {
        Box( // Caja interna
            modifier = Modifier
                .width(100.dp) // Ancho fijo de 100 dp
                .height(200.dp) // Alto fijo de 200 dp
                .background(Color.Yellow) // Fondo amarillo para la caja interna
        )
    }
}
