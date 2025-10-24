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
fun Ejercicio03(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (morada, gris1, gris2, gris3) = createRefs()


        Box(
            modifier = Modifier
                .size(width = 200.dp, height = 200.dp)
                .background(Color(0xFF800080))
                .constrainAs(morada) {
                    top.linkTo(parent.top, margin = 16.dp)
                    bottom.linkTo(parent.bottom, margin = 16.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                    end.linkTo(parent.end, margin = 16.dp)
                }
        )


        Box(
            modifier = Modifier
                .size(80.dp, 56.dp)
                .background(Color.DarkGray)
                .constrainAs(gris1) {
                    bottom.linkTo(parent.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .size(80.dp, 56.dp)
                .background(Color.Gray)
                .constrainAs(gris2) {
                    bottom.linkTo(parent.bottom, margin = 16.dp)
                    start.linkTo(gris1.end)
                }
        )

        Box(
            modifier = Modifier
                .size(80.dp, 56.dp)
                .background(Color.LightGray)
                .constrainAs(gris3) {
                    bottom.linkTo(parent.bottom, margin = 16.dp)
                    start.linkTo(gris2.end)
                }
        )
    }
}
