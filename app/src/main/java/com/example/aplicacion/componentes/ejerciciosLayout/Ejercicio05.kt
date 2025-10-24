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
fun Ejercicio05(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (cabecera, azul1, azul2, verde1, verde2, verde3, amarilla, roja, f1, f2, f3) = createRefs()
        val g40 = createGuidelineFromStart(0.4f)
        val g70 = createGuidelineFromStart(0.7f)
        val g30h = createGuidelineFromTop(0.3f)

        val barrierCuerpo = createBottomBarrier(azul1, azul2, verde1, verde2, verde3)

        // Cabecera magenta
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(width = 400.dp, height = 80.dp)
                .constrainAs(cabecera) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        // Columna 1 azul marino + azul medio
        Box(
            modifier = Modifier
                .size(100.dp, 120.dp)
                .background(Color(0xFF000080))
                .constrainAs(azul1) {
                    top.linkTo(g30h)
                    start.linkTo(parent.start)
                    end.linkTo(g40)
                }
        )

        Box(
            modifier = Modifier
                .size(100.dp, 180.dp)
                .background(Color(0xFF0000CD))
                .constrainAs(azul2) {
                    top.linkTo(azul1.bottom, margin = 12.dp)
                    start.linkTo(parent.start)
                    end.linkTo(g40)
                }
        )

        // Columna 2 verdes
        Box(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color(0xFF006400))
                .constrainAs(verde1) {
                    top.linkTo(g30h)
                    start.linkTo(g40)
                    end.linkTo(g70)
                }
        )

        Box(
            modifier = Modifier
                .size(100.dp, 120.dp)
                .background(Color.Green)
                .constrainAs(verde2) {
                    top.linkTo(verde1.bottom, margin = 12.dp)
                    start.linkTo(g40)
                    end.linkTo(g70)
                }
        )

        Box(
            modifier = Modifier
                .size(100.dp, 120.dp)
                .background(Color(0xFF90EE90))
                .constrainAs(verde3) {
                    top.linkTo(verde2.bottom, margin = 12.dp)
                    start.linkTo(g40)
                    end.linkTo(g70)
                }
        )

        // Columna 3 amarilla
        Box(
            modifier = Modifier
                .size(200.dp, 50.dp)
                .background(Color.Yellow)
                .constrainAs(amarilla) {
                    top.linkTo(g30h)
                    start.linkTo(g70)
                    end.linkTo(parent.end)
                }
        )

        // Franja roja (debajo del barrier del cuerpo)
        Box(
            modifier = Modifier
                .size(300.dp, 40.dp)
                .background(Color.Red)
                .constrainAs(roja) {
                    top.linkTo(barrierCuerpo, margin = 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        // Footer con 3 grises 
        Box(
            modifier = Modifier
                .size(80.dp, 56.dp)
                .background(Color.DarkGray)
                .constrainAs(f1) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .size(80.dp, 56.dp)
                .background(Color.Gray)
                .constrainAs(f2) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(f1.end)
                }
        )

        Box(
            modifier = Modifier
                .size(80.dp, 56.dp)
                .background(Color.LightGray)
                .constrainAs(f3) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(f2.end)
                }
        )
    }
}
