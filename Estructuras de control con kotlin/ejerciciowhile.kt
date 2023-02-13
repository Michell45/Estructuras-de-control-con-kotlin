/*ejercicio while */


/*Este ciclo hace uso de una condición en la que se valida la condición de parada, 
si esta condición es verdadera entonces se ingresa 
al ciclo repitiendo hasta que la condición sea falsa y el ciclo termine.
 Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo, 
el usuario ingresará la cantidad de personas a validar.
*/

fun main() {
    print("Ingrese la cantidad de personas a saludar: ")
    val cantidadPersonas = readLine()!!.toInt()/*se utiliza la función readLine() para leer el número ingresado por el usuario */
    /*y se almacena en la variable cantidadPersonas. La función readLine() retorna una cadena de caracteres, 
    por lo que se utiliza el operador !! para hacer una conversión explícita a un entero y 
    el método toInt() para realizar la conversión. */
    var contador = 1 /*se inicializa la variable contador en 1.*/
    while (contador <= cantidadPersonas){/*se utiliza un bucle while para 
        repetir el proceso de solicitar el nombre de una persona y saludarla, tantas veces 
        como la cantidad de personas especificada por el usuario. */
    print("Ingrese el nombre de la persona $contador: ")
    val nombre = readLine()!!
    println("Hola $nombre, ¡Bienvenido!")
    contador++
    }
}
/*El código comienza con la impresión en la consola del mensaje "Ingrese el nombre de la persona $contador:"
, solicitando al usuario que ingrese el nombre de una persona. Luego, se utiliza la función readLine() 
para leer el nombre ingresado por el usuario y se almacena en la variable nombre. La función readLine() 
retorna una cadena de caracteres, por lo que se utiliza el operador !! para hacer 
una conversión explícita a una cadena de caracteres. 
*/
/*Después, se imprime en la consola el mensaje "Hola $nombre, ¡Bienvenido!", saludando a la persona 
cuyo nombre se ha ingresado. Finalmente, se incrementa el valor de la variable 
contador en 1, probablemente como parte de un bucle que permite saludar a varias personas. 
*/