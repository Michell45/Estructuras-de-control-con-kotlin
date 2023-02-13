/*uso del when */

/*La estructura when en Kotlin es una estructura de control de flujo que funciona como un switch case
 en otros lenguajes de programación. Se utiliza 
para evaluar una expresión y ejecutar un bloque de código específico en función del valor de la expresión.*/

fun main(){ /*Esta línea define la función main, que es la entrada */

    /*Aquí se define una variable de tipo String llamada menu que contiene una cadena de texto. 
    Esta cadena  imprime en la consola el menú de opciones */
    var menu="""                    
    MENU DE OPCIONES
    1. Saludar
    2. Pedir Nombre de una Persona
    3. Sumar 2 Números
    Ingrese una opción :"""

    println(menu)
    var opcion=readLine()!!.toInt() 

    when(opcion){
    1 -> println("Hola!")
    2 -> {
    print("Ingresa el nombre de una persona: ")
    val name = readLine()!!.toString()
    println("Hola, $name")
    }
    3 -> {
        print("Ingrese el primer número: ")
        val num1 = readLine()!!.toInt()
        print("Ingrese el segundo número: ")
        val num2 = readLine()!!.tnoIt()
        val sum = num1 + num2
        println("La suma de los números es: $sum")
    }
    else -> println ("Código de acción no válido")
}
}

/*La estructura when se utiliza para realizar una acción dependiendo del valor de opcion del menu. Si 
 su opcion es igual a 1, se imprime "Hola!".
 Si su opcion es igual a 2, se pide al usuario que ingrese un nombre y se imprime "Hola, [nombre ingresado]". 
 Si su opcion es igual a 3, se piden al usuario dos números y se imprime la suma de ellos. 
Si opcion no coincide con ninguno de los valores, se imprime "Código de acción no válido". */