package com.example.aplicacion // Define el "paquete" donde está tu clase (como una carpeta lógica)

import android.os.Bundle // Importa la clase Bundle (se usa para guardar/recuperar estado)
import androidx.activity.ComponentActivity // Importa la clase base para actividades en Compose
import androidx.activity.compose.setContent // Permite establecer el contenido de la pantalla usando Compose
import androidx.activity.enableEdgeToEdge // Permite que tu app use toda la pantalla (incluyendo barras del sistema)
import androidx.compose.foundation.layout.fillMaxSize // Modificador: hace que un componente ocupe todo el tamaño disponible
import androidx.compose.foundation.layout.padding // Modificador: agrega espacio alrededor de un componente
import androidx.compose.material3.Scaffold // Estructura de diseño que provee un layout básico (con espacios para barra superior, inferior, etc.)
import androidx.compose.runtime.Composable // Anotación para declarar una función que dibuja UI en Compose
import androidx.compose.ui.Modifier // Clase para modificar cómo se dibujan los componentes
import androidx.compose.ui.tooling.preview.Preview // Permite crear una vista previa de la UI en Android Studio
import com.example.aplicacion.componentes.Calculadora.CalculadoraLoca
import com.example.aplicacion.componentes.ejerciciosLayout.Ejercicio01
import com.example.aplicacion.componentes.ejerciciosLayout.Ejercicio02
import com.example.aplicacion.componentes.ejerciciosLayout.Ejercicio03
import com.example.aplicacion.componentes.ejerciciosLayout.Ejercicio04
import com.example.aplicacion.componentes.ejerciciosLayout.Ejercicio05
import com.example.aplicacion.ui.theme.APLICACIONTheme // Importa el tema visual de tu app (colores, tipografías, etc.)

// Clase principal de tu aplicación, hereda de ComponentActivity
class MainActivity : ComponentActivity() {
    // Se llama cuando la actividad se crea (punto de entrada)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Llama a la implementación original (importante)
        enableEdgeToEdge() // Habilita el modo de pantalla completa usando las barras del sistema
        setContent { // Aquí defines el contenido de la pantalla con Compose
            APLICACIONTheme { // Aplica el tema visual definido en tu app
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Scaffold crea un layout básico que maneja paddings y barras
                    // Modifier.fillMaxSize() = ocupa toda la pantalla
                    // innerPadding = espacio que Scaffold pasa para no tapar contenido

                    Greeting( // Llamas a tu función composable "Greeting"
                        name = "Android", // Le pasas un texto como parámetro
                        modifier = Modifier.padding(innerPadding) // Le aplicas el padding que recomienda Scaffold
                    )
                }
            }
        }
    }
}
// Función composable: define una parte de la UI
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //MyBox(modifier)
    //MyComplexLayout(modifier)
    //MyRow(modifier)
    //MyGrid(modifier)
    //MyConstraint01(modifier)
    //MyConstraintBarrier(modifier)
    //Ejercicio01(modifier)
    //Ejercicio02(modifier)
    //Ejercicio03(modifier)
    //Ejercicio04(modifier)
    //Ejercicio05(modifier)
    CalculadoraLoca(modifier)
}

// Vista previa en Android Studio (no se ejecuta en el celular, solo en diseño)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    APLICACIONTheme {
        Greeting("Android")
    }
}
