//Los bucles en kotlin son similares a otros lenguajes
fun main(){


    //1. escribe un bucle que imprima por pantalla del 0 al 9 usando while
    println("*****EJERCICIO 1*****")
    var i = 0

    while (i<10) {
        println(i)
        i++
    }

    //2. Escribe un bucle que imprima por pantalla del 0 al 10 usando for
    println("\n*****EJERCICIO 2*****")
    // Asi se hacen los bucles for en kotlin, en Java sería: for(int j=0; j<=10; j++)
    for (j in 0..10) {
        println(j)
    }

    //3. Escribe un bucle forEach que imprima por pantalla del 0 al 5
    println("\n*****EJERCICIO 3*****")
    (0..5).forEach{
        println(it)
    }

    //4. Escribe un bucle que imprima por pantalla del 5 al 10 (se puede usar cualquier bucle)
    println("\n*****EJERCICIO 4*****")
    (5..10).forEach {
        println(it)
    }
}

