/*ejercicio del for */

/*El ciclo for es una estructura de control de bucle en Kotlin que se
 utiliza para iterar una secuencia de elementos.*/

fun main() { /*Esta línea define la función main, que es la entrada */
    var cantidadEstudiantes: Int  /*variable cantidadEstudiantes es inicializada con la entrada del usuario.*/ 
    var sumaPromedios = 0.0 /*La variable sumaPromedios es inicializada en 0.0  yes para almacenar los promedios */
    println("Ingrese la cantidad de estudiantes: ")
    cantidadEstudiantes = readLine()!!.toInt()
    for (i in 1..cantidadEstudiantes) { /*sehace un bucle con el
     for que se ejecuta cantidadEstudiantes para procesar 
    cada uno de los promedios ingresados.   */
    println("Ingrese el promedio del estudiante $i: ")
    var promedio = readLine()!!.toDouble() /* La función "toDouble()" 
    se utiliza para convertir el string leído desde el teclado a un número con decimal. */
    sumaPromedios += promedio
    }
    var promedioTotal = sumaPromedios / cantidadEstudiantes /*ya finalmente se calcula el promedio total */
    println("Cantidad de estudiantes procesados: $cantidadEstudiantes")
    println("Promedio total de los promedios: $promedioTotal")
}
    