//Los bucles en kotlin son similares a otros lenguajes
fun main(){


    //1. escribe un bucle que imprima por pantalla del 0 al 9 usando while
    println("-----EJERCICIO 1-----")
    var i = 0

    while (i<10) {
        println(i)
        i++
    }

    //2. Escribe un bucle que imprima por pantalla del 0 al 10 usando for
    println("\n-----EJERCICIO 2-----")
    // Asi se hacen los bucles for en kotlin, en Java sería: for(int j=0; j<=10; j++)
    for (j in 0..10) {
        println(j)
    }

    //3. Escribe un bucle forEach que imprima por pantalla del 0 al 5
    println("\n-----EJERCICIO 3-----")
    (0..5).forEach{
        println(it)
    }

    //4. Escribe un bucle que imprima por pantalla del 5 al 10 (se puede usar cualquier bucle)
    println("\n-----EJERCICIO 4-----")
    (5..10).forEach {
        println(it)
    }

    //5. Escribe un bucle que imprima por pantalla de 6 a 2, para recorrer de forma descendente es necesaria la funcion downTo
    println("\n-----EJERCICIO 5-----")
    for (j in 6 downTo 2) {
        println(j)
    }

    //6. Recorre una lista e imprime por pantalla su contenido
    println("\n-----EJERCICIO 6-----")
     val letras = listOf("a","b","c","d") //asi se crean variables de tipo lista
    for (i in letras) { //la variable i tendra de valor cada elemento de la lista letras
        println(i)
    }

    //7. Recorre la lista letras e imprime por pantalla su contenido usando foreach
    println("\n-----EJERCICIO 7-----")
    letras.forEach{
        println(it)
    }

    //8. Recorre una lista de numeros e imprime por pantalla las edades pares usando foreach
    println("\n-----EJERCICIO 8-----")
    val edades = listOf(20,18,31,33,15,22)
    edades.forEach {
        if (it%2==0){
            println(it)
        }
    }

}

