package com.example.aplicacion.componentes.ejerciciosLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun Ejercicio04(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (cian, turquesa, aguamarina, naranja, negra) = createRefs()
        val barrier = createBottomBarrier(cian, turquesa, aguamarina)

        Box(
            modifier = Modifier
                .height(120.dp)
                .width(200.dp)
                .background(Color.Cyan)
                .constrainAs(cian) {
                    top.linkTo(parent.top, margin = 16.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        )

        Box(
            modifier = Modifier
                .height(180.dp) // fijo, aunque decía variable con min/max
                .width(200.dp)
                .background(Color(0xFF40E0D0))
                .constrainAs(turquesa) {
                    top.linkTo(cian.bottom, margin = 12.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        )

        Box(
            modifier = Modifier
                .height(120.dp)
                .width(200.dp)
                .background(Color(0xFF7FFFD4))
                .constrainAs(aguamarina) {
                    top.linkTo(turquesa.bottom, margin = 12.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        )

        Box(
            modifier = Modifier
                .height(48.dp)
                .width(200.dp)
                .background(Color(0xFFFFA500))
                .constrainAs(naranja) {
                    top.linkTo(barrier, margin = 16.dp)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .height(48.dp)
                .width(300.dp)
                .background(Color.Black)
                .constrainAs(negra) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
        )
    }
}
