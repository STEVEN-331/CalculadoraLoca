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
fun Ejercicio02(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (a, b, c, d, e, f) = createRefs()
        val g1 = createGuidelineFromStart(0.33f)
        val g2 = createGuidelineFromStart(0.66f)


        Box(
            modifier = Modifier
                .size(width = 60.dp, height = 100.dp)
                .background(Color.Red)
                .constrainAs(a) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(g1)
                }
        )

        Box(
            modifier = Modifier
                .size(width = 60.dp, height = 100.dp)
                .background(Color.Blue)
                .constrainAs(b) {
                    top.linkTo(parent.top)
                    start.linkTo(g1)
                    end.linkTo(g2)
                }
        )

        Box(
            modifier = Modifier
                .size(width = 60.dp, height = 100.dp)
                .background(Color.Green)
                .constrainAs(c) {
                    top.linkTo(parent.top)
                    start.linkTo(g2)
                    end.linkTo(parent.end)
                }
        )


        Box(
            modifier = Modifier
                .size(width = 60.dp, height = 100.dp)
                .background(Color.Yellow)
                .constrainAs(d) {
                    top.linkTo(a.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(g1)
                }
        )

        Box(
            modifier = Modifier
                .size(width = 60.dp, height = 100.dp)
                .background(Color.Gray)
                .constrainAs(e) {
                    top.linkTo(b.bottom)
                    start.linkTo(g1)
                    end.linkTo(g2)
                }
        )

        Box(
            modifier = Modifier
                .size(width = 60.dp, height = 100.dp)
                .background(Color.Magenta)
                .constrainAs(f) {
                    top.linkTo(c.bottom)
                    start.linkTo(g2)
                    end.linkTo(parent.end)
                }
        )
    }
}
