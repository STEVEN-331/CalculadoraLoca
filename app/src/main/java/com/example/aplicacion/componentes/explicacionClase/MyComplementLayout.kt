package com.example.aplicacion.componentes.explicacionClase

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyComplexLayout(modifier: Modifier = Modifier){
    Column (modifier = modifier){
        Box( modifier = Modifier
            .weight(weight =1f)
            .fillMaxWidth()
            .background(Color.Red)

        )
        Box( modifier = Modifier
            .weight(weight =1f)
            .fillMaxWidth()
            .background(Color.Blue)

        )
        Box( modifier = Modifier
            .weight(weight =1f)
            .width(width = 2300.dp)
            .background(Color.Yellow)

        )

    }

}