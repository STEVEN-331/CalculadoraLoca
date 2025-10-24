# 🧮 Calculadora Loca XD

**Repositorio:** [https://github.com/STEVEN-33/CalculadoraLoca](https://github.com/STEVEN-33/CalculadoraLoca)

---

## 📱 Descripción del proyecto

Esta es mi **Calculadora Loca**, hecha en **Jetpack Compose** para la asignatura de **PMDM** (2º DAM).  
La idea es que la calculadora funcione como una normal, pero con cosas raras, porque el profe nos pidió que:

- No haya **botón del número 5** ❌
- Cada número que pulses **inserte otro número distinto (+2)** 🔢
- Los símbolos de las operaciones sean falsos, por ejemplo `&` hace suma ➕
- Y si el resultado tiene un **5**, se muestra como **6** 😜

Está hecha totalmente en Compose usando `remember` para los estados (`expresion`, `resultado`).

---

## 🧮 Mapa de desorden (números y operaciones)

### 🔢 Números locos
| Botón que se ve | Inserta en realidad |
|------------------|----------------------|
| 0 | 2 |
| 1 | 3 |
| 2 | 4 |
| 3 | 5 |
| 4 | 6 |
| 6 | 8 |
| 7 | 9 |
| 8 | 0 |
| 9 | 1 |

> El número 5 no aparece por ningún lado 👻

### 🔣 Operaciones locas
| Botón que se ve | Operación real |
|------------------|----------------|
| & | + (suma) |
| % | - (resta) |
| x | * (multiplicación) |
| : | / (división) |

---

## ⚙️ Cómo funciona

- Pulsas los botones y la app mete los valores “locos” 😅
- Cuando le das a `=`, calcula el resultado y cambia los 5 por 6.
- Botón “Borrar” para limpiar la pantalla.
- Todo hecho con **Jetpack Compose (Material3)**.

---

## ▶️ Cómo ejecutarlo

1. Abre el proyecto en **Android Studio**
2. Pulsa el botón **Run App ▶️**
3. Verás el título *“Calculadora Loca 🤪”*
4. Prueba varios números y operaciones.

---

## 🎬 Vídeo de demostración

📹 [Enlace al vídeo (YouTube o Drive)](https://...)  
*(Aún no subido, pero lo grabaré mostrando que no hay 5, que cambia +2, y el resultado 5→6)*

---

## 👨‍💻 Autor

**Nombre:** Steven  
**Curso:** 2º DAM  
**Módulo:** PMDM  
**Año:** 2025

---

> *“La calculadora no tiene el 5, pero tiene toda la locura que hace falta para aprobar 😎”*
