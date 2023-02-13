/*Este tipo de estructuras permite ejecutar una determinada acción 
cuando se cumple determinada condición. Se evalúa 
una sola condición, si no se cumple la condición no se efectúa ningún proceso, 
y si se cumple realiza la acción correspondiente. */

/*condicionales simples */
/*Haga un algoritmo que calcule el valor absoluto de un número*/

fun main() {
    println("Ingrese el número:")/* */
    var num = readLine()!!.toInt()/* aqui vamos a crear una variable llamada num ,se utiliza la función readLine() 
    para leer el número ingresado por el usuario y se almacena en la variable num */
    /*La función readLine() retorna una cadena de caracteres, 
     */
    if (num < 0) {/*se utiliza una sentencia if para verificar si num es menor que 0. 
        Si es así, se multiplica num por -1 para calcular su valor absoluto. */
    num *= -1
    }
    println("El valor absoluto del número es: $num")
     /*se imprime en la consola el mensaje 
    "El valor absoluto del número es: $num", 
    informando al usuario del valor absoluto calculado. 
*/
}
    