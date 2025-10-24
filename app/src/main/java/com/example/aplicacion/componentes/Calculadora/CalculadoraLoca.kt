package com.example.aplicacion.componentes.Calculadora

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculadoraLoca(modifier: Modifier = Modifier) {
    var expresion by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    // Esto es para que a cada boton de numero le sume dos
    val mapaNumeros = mapOf(
        "0" to "2", "1" to "3", "2" to "4", "3" to "5", "4" to "6",
        "6" to "8", "7" to "9", "8" to "0", "9" to "1"
    )

    // Mapeo de operaciones locas
    val mapaOperaciones = mapOf(
        "&" to "+",  // suma
        "%" to "-",  // resta
        "x" to "*",  // multiplicación
        ":" to "/"   // división
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE0F7FA))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Calculadora Loca XD ",
            fontSize = 26.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        TextField(
            value = expresion,
            onValueChange = { expresion = it },
            label = { Text("Escribe tu locura") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Gray,
                focusedLabelColor = Color.Blue
            )
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text("Resultado: $resultado", fontSize = 20.sp, color = Color.Black)

        Spacer(modifier = Modifier.height(10.dp))

        // Botones de números (sin el 5)
        val filas = listOf(
            listOf("1", "2", "3"),
            listOf("4", "6", "7"),
            listOf("8", "9", "0")
        )

        for (fila in filas) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth().padding(4.dp)
            ) {
                for (num in fila) {
                    Button(
                        onClick = { expresion += mapaNumeros[num] ?: "" },
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp)
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
                    ) {
                        Text(num, fontSize = 22.sp, color = Color.White)
                    }
                }
            }
        }

        // Botones de operaciones
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().padding(4.dp)
        ) {
            for (op in mapaOperaciones.keys) {
                Button(
                    onClick = { expresion += mapaOperaciones[op] ?: "" },
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
                ) {
                    Text(op, fontSize = 22.sp, color = Color.Black)
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Botón igual
        Button(
            onClick = {
                try {
                    val res = evalua(expresion)
                    resultado = res.replace('5', '6') // reemplazo 5 → 6
                } catch (e: Exception) {
                    resultado = "Error"
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
        ) {
            Text("=", fontSize = 24.sp, color = Color.Black)
        }

        // Botón para borrar
        Button(
            onClick = {
                expresion = ""
                resultado = ""
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text("Borrar", fontSize = 24.sp, color = Color.White)
        }
    }
}

fun evalua(expr: String): String {
    return try {
        val resultado = object : Any() {
            var pos = -1
            var ch = 0

            fun sig() { ch = if (++pos < expr.length) expr[pos].code else -1 }

            fun parse(): Double {
                sig()
                val x = parseExpr()
                return x
            }

            fun parseExpr(): Double {
                var x = parseTerm()
                while (true) {
                    when (ch.toChar()) {
                        '+' -> { sig(); x += parseTerm() }
                        '-' -> { sig(); x -= parseTerm() }
                        else -> return x
                    }
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    when (ch.toChar()) {
                        '*' -> { sig(); x *= parseFactor() }
                        '/' -> { sig(); x /= parseFactor() }
                        else -> return x
                    }
                }
            }

            fun parseFactor(): Double {
                val startPos = pos
                if (ch == '('.code) {
                    sig()
                    val x = parseExpr()
                    sig()
                    return x
                } else {
                    while (ch in '0'.code..'9'.code) sig()
                    return expr.substring(startPos, pos).toDouble()
                }
            }
        }.parse()
        resultado.toInt().toString()
    } catch (e: Exception) {
        "Error"
    }
}
