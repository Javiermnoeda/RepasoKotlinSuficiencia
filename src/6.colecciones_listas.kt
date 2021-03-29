/*
    Las estructuras de datos son una parte muy importante de cualquier lenguaje de programacion
    También son importantes los conceptos mutable(var) e inmutable(val)
 */

fun main(){

    //1. Crear variables del tipo MutableList y List
    println("-----EJERCICIO 1-----")
    val numeros: List<Int> = listOf(3,14,25,36) //Lista inmutable
    println("Lista inmutable: $numeros")
    val numerosMutable: MutableList<Int> = mutableListOf(7,2,9) //Lista mutable
    println("Lista mutable: $numerosMutable")
    numerosMutable.add(4) //añadir valores a una lista mutable
    println("Lista mutable modificada: $numerosMutable")

    //numerosMutable.clear()
    //println("$numerosMutable, como podemos la lista de numeros mutable se ha vaciado")

    //2. Acceder a las posiciones del MutableList y List
    println("\n-----EJERCICIO 2-----")
    println("Tercer elemento de la lista inmutable: "+numeros[2])
    println("Cuarto elemento de la lista mutable: "+numerosMutable[3])

    //3. Obtener el primer y ultimo elemento de cada lista
    println("\n-----EJERCICIO 3-----")
    println("Primer numero de la lista inmutable: "+numeros.first())
    println("Último numero de la lista imnutable: "+numeros.last())
    println("Primer numero de la lista mutable: "+numerosMutable.first())
    println("Último numero de la lista mutable: "+numerosMutable.last())

    //4. Crear una lista llamada numerosPares con los numeros pares de la variable numeros
    println("\n-----EJERCICIO 4-----")
    val numerosPares: MutableList<Int> = mutableListOf()
    for (n in numeros){
        if (n%2 == 0){
            numerosPares.add(n)
        }
    }
    println("La lista de numeros pares es: $numerosPares")
    //Otra forma de hacerlo
//    val numerosPares: List<Int> = numeros.filter { it % 2 == 0 }
//    println("Nueva lista de pares: $numerosPares")

    //5. MOstrar el ultimo numero par de la lista edades
    println("\n-----EJERCICIO 5-----")
    val edades = listOf(18,33,25,12,11,15)
    val ultimaEdadPar = edades.last { it%2 == 0}
    println("Edades = $edades")
    println("Última edad par: $ultimaEdadPar")
}