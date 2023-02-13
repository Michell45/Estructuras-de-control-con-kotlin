/*condiciones dobles */


//Funciona de la 
//misma manera que el anterior, 
//solo que estas estructuras permiten no solo 
//ejecutar una determinada acción cuando se cumple determinada condición, 
//sino que en caso de que la condición no se cumpla, 
//brinda otro camino para realizar acciones diferentes.


fun main() {
    // Imprimir un mensaje para pedir al usuario que ingrese su nombre
    println("Ingrese su nombre:")

    // Leer la entrada del usuario y almacenarlo en una variable llamada "nombre"
    val nombre = readLine().toString()

    // Imprimir un mensaje para pedir al usuario que ingrese su materia
    println("Ingrese su materia:")

    // Leer la entrada del usuario y almacenarlo en una variable llamada "materia"
    val materia = readLine().toString()

    // Imprimir un mensaje para pedir al usuario que ingrese la nota 1
    println("Ingrese la nota1:")

    // Leer la entrada del usuario y convertirla a un número flotante
    // y almacenarlo en una variable llamada "nota1"
    val nota1 = readLine()!!.toFloat()

    // Imprimir un mensaje para pedir al usuario que ingrese la nota 2
    println("Ingrese la nota2:")

    // Leer la entrada del usuario y convertirla a un número flotante
    // y almacenarlo en una variable llamada "nota2"
    val nota2 = readLine()!!.toFloat()

    // Imprimir un mensaje para pedir al usuario que ingrese la nota 3
    println("Ingrese la nota3:")

    // Leer la entrada del usuario y convertirla a un número flotante
    // y almacenarlo en una variable llamada "nota3"
    val nota3 = readLine()!!.toFloat()

    // Calcular el promedio de las tres notas y almacenarlo en una variable llamada 
    "prom"
    val prom = (nota1 + nota2 + nota3) / 3

    // Imprimir el promedio de las notas
    println("El promedio de notas es: $prom")

    // Verificar si el promedio es mayor o igual a 3.5
    if (prom >= 3.5) {
        // Si es así, imprimir un mensaje indicando que el estudiante ganó la materia
        println("El estudiante $nombre GANÓ la materia $materia")
    } else {
        // De lo contrario, imprimir un mensaje indicando que el estudiante perdió la materia
        println("El estudiante $nombre PERDIÓ la materia $materia")
    }
}
    