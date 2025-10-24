package com.example.aplicacion.componentes.ejerciciosLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun Ejercicio01(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (roja, azul, verde, amarilla) = createRefs()

        Box(
            modifier = Modifier
                .size(width = 400.dp, height = 80.dp)
                .background(Color.Red)
                .constrainAs(roja) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        // Azul
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Blue)
                .constrainAs(azul) {
                    top.linkTo(roja.bottom)
                    start.linkTo(parent.start)
                }
        )

        // Verde
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Green)
                .constrainAs(verde) {
                    top.linkTo(roja.bottom)
                    end.linkTo(parent.end)
                }
        )

        // Amarillo
        Box(
            modifier = Modifier
                .size(width = 120.dp, height = 120.dp)
                .background(Color.Yellow)
                .constrainAs(amarilla) {
                    top.linkTo(roja.bottom)
                    start.linkTo(azul.end)
                    end.linkTo(verde.start)
                }
        )
    }
}
