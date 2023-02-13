/*Condicionales anidados */


/*Se aplican las estructuras condicionales, ya que es muy común encontrar casos en los que después de tomar 
una decisión, se requiera seguir un posible camino donde se tengan que implementar nuevas condiciones
donde en cada bloque de SI o SINO, pueden existir nuevas condiciones y dentro de estas nuevos procesos */

fun main() {  
    println ("Ingrese un numero:")
    val edad = readLine()!!.toInt() // Edad de la persona

    if (edad >= 18) { /*este primer if, se realiza una  comparación, entre "edad".
     Si "edad" es igual a 25 esto significa que la persona tiene 25 años.*/
    
        println("La persona es mayor de edad")
        if (edad == 25) {
            println("Además, la persona tiene 25 años")/*En este caso, se imprime en la consola el mensaje 
            "Además, la persona tiene 25 años". */ 
        }
    } else {
        println("La persona es menor de edad")/*Si la primera comparación no se cumple (es decir, si "edad" 
        es menor a "edadMayor"), significa que la persona es menor de edad. 
        En este caso, se imprime en la consola el mensaje "La persona es menor de edad". */
    }
}