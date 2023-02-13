/*ejercicio do while */


 /* Es una estructura de control de repetición en 
 Kotlin que se utiliza para ejecutar un bloque de código al menos una vez y 
 luego repetir el bloque mientras se cumpla una determinada condición.
*/

fun main() { /*Esta línea define la función main, que es la entrada */
    var numero: Int
    var continuar = "si"
    do {
    print("Ingrese un número: ")
    numero = readLine()!!.toInt() /*  La función readLine lee una línea 
    de texto desde la consola y la devuelve como una cadena */
   

    if (numero < 0) {   /*si el número ingresado es menor a 0, se multiplica 
        por -1 para hacerlo positivo. La función numero * -1 devuelve el valor negativo de un número */
    numero = numero * -1
    }
    println("El número positivo es: $numero") /* se encarga de mostrar el resultado del número que ha sido ingresado por el usuario.  */
    print("¿Desea ingresar otro número? (si/no): ")
    continuar = readLine()!!
    } while (continuar.uppercase() == "SI") /*La función "uppercase()"
 convierte la entrada del usuario a mayúsculas para evitar errores en la comparación.  */
 /*Si la respuesta es "SI" el bucle se ejecuta de nuevo */
}
    