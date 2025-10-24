package com.example.aplicacion.componentes.explicacionClase

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
fun MyConstraint01(modifier: Modifier= Modifier){

    ConstraintLayout(modifier = modifier){

        val(box1, box2 ,box3 , box4, box5 )= createRefs()

        Box(
            modifier = Modifier
            .size (size=200.dp)
            .background(Color.Red)
            .constrainAs(ref = box1){
                end.linkTo(anchor=parent.end)
                bottom.linkTo(anchor=parent.bottom)
                start.linkTo(anchor=parent.start)
                top.linkTo(anchor=parent.top)
            })
        Box(
            modifier = Modifier
                .size (size=200.dp)
                .background(Color.Yellow)
                .constrainAs(ref = box2){
                    top.linkTo(anchor=box1.bottom)
                    start.linkTo(anchor=box1.end)
                })
        Box(
            modifier = Modifier
                .size (size=200.dp)
                .background(Color.Gray)
                .constrainAs(ref = box3){
                    top.linkTo(anchor=box1.bottom)
                    end.linkTo(anchor=box1.start)
                })
        Box(
            modifier = Modifier
                .size (size=200.dp)
                .background(Color.Blue)
                .constrainAs(ref = box4){
                    bottom.linkTo(anchor=box1.top)
                    start.linkTo(anchor=box1.end)


                })
        Box(
            modifier = Modifier
                .size (size=200.dp)
                .background(Color.Green)
                .constrainAs(ref = box5){
                    bottom.linkTo(anchor=box1.top)
                    end.linkTo(anchor=box1.start)

                })



    }

}
@Composable
fun MyConstraintGuide(modifier: Modifier=Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()){
        val BoxRed = createRef()
        val topGuide = createGuidelineFromTop(fraction=0.1f)

    Box(
        modifier = Modifier
            .size(size=200.dp)
            .background(Color.Red)
            .constrainAs(ref = BoxRed){
                top.linkTo(anchor=topGuide)
            }

    )}
}


@Composable

fun MyConstraintBarrier(modifier:Modifier = Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()){
        val (boxRed, boxBlue, boxGreen) = createRefs()
        val barrier=createEndBarrier(boxRed, boxBlue)

        Box(
            modifier = Modifier
                .size(size = 200.dp)
                .background(Color.Red)
                .constrainAs(ref=boxRed){
                    top.linkTo(anchor = parent.top)
                    start.linkTo(anchor = parent.start)
                }
        )
        

    }


}