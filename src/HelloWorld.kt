import java.util.*
import kotlin.random.Random


fun main(args: Array<String>){
    println("Holaaaaa que tal")

    var num1 = 0
        num1++
            println(num1)

    val num2 = 0
        // num2++
            println(num2)

    var lista1 = mutableListOf(1,2,3,4,5)
        lista1.add(5)
            println(lista1)

    val lista2 = mutableListOf(6,7,8,9,10)
        println(lista2)

    val num3 : Int? = 1

    if (num3 != null){
        val num4 = num3 + num2
    } else {
        println("Asegurate de que num3 no sea null!!!!")
    }

    num3?.let{ //si num3 no es null, ejecuta el siguiente codigo
        val num4 = it + num2
    } ?: run {
        println("Asegurate de que num3 no sea null!!!!")
    }

    //¡¡¡¡¡¡IMPORTANTE: Vigilar siempre que el valor al que queremos acceder no sea nulo!!!!!

    when (num3) {
        0 -> println("Valor 0")
        1 -> println("Valor 1")
        null -> {
            println("valor nulo")
            println(":(")
        }
    }

    //Quiero tener una variable num5 que sea la suma de num3 y num2. En caso de que num3 sea null, entonces multiplica num2 y num2

    //Método JAva
    var num4 = 0
    if (num3!=null){
         num4 = num2 + num3
    } else {
         num4 = num2 * num2
    }

    println("El resultado es $num4")

    //Metodo Kotlin
    var num5 = if (num3!=null) {
         num2 + num3
    } else {
         num2 * num2
    }
    println("El resultado es $num5")

    var num7 = when (num3) {
        0 -> "Valor 0"
        1 -> "Valor 1"
        null -> "valor nulo"
        else -> "otro valor"
    }

    println(num7)

    //Que sería igual a:
    print(when (num3) {
        0 -> "Valor 0"
        1 -> "Valor 1"
        null -> "valor nulo"
        else -> "otro valor"
    })

    //Video 2 --> BUCLEs

    //Suma en num8 numeros aleatorios hasta que llegue a 100
        var condicionCumplida = false
        var num8 = 0

        while (!condicionCumplida){
            num8 += Random.nextInt(100)
            if (num8 >= 100) condicionCumplida = true
            println(num8)
    }

    //Equivalente a lo anterior
    while(num8 <= 100) {
        num8 += Random.nextInt(100)
        println(num8)
    }

    do {
        num8 += Random.nextInt(100)
        println(num8)
    } while (num8 <= 100)

    repeat(10) {
        println("Estoy en la repeticion $it")
    }

    for (i in 0..20){
        println("Estoy en la repeticion $i")
        num8 += Random.nextInt(100)
        if (num8>100) break // se puede hacer solo en una linea
    }

    //Lista vacia sin parámetros. Te fuerza a especificar el tipo de los parámetros
    var listaVacia = listOf<Int>()

    //Lista con parámetros. No te fuerza a especificar el tipo
    val listaNumeros = listOf(1,2,3,4)

    //Una lista mutable nos permite añadir y eliminar elementos
    val listaNumerosMutable = mutableListOf(1,2,3,4)
    listaNumerosMutable.add(5)

    //Podemos transformar una lista no mutable en una copia de la lista mutable
    var copiaListaVacia = listaVacia.toMutableList()
    copiaListaVacia.add(1)
    copiaListaVacia.add(2)
    copiaListaVacia.add(3)
    listaVacia = copiaListaVacia
    println(listaVacia)

    //para leer los elementos de una lista se hace:
    copiaListaVacia[0]

    //para eliminar un elemento
    copiaListaVacia.remove(2) // Nos elimina el xq eliminamos a un elemento que es un 2
    println(copiaListaVacia)
    copiaListaVacia.removeAt(1) // nos elimina el 3 xq está en la segunda posición.
    println(copiaListaVacia)

    val listaPalabrasLargas = mutableListOf("Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete")

println("\n")

    //1. Quiero que escriba los elementos cuyo numero de caracteres sea par
    listaPalabrasLargas.forEach { numero ->
        if (numero.length%2==0)  println("Elemento cuyo numero de caracteres sea par: $numero")
    }

println("\n")

    //2. Quiero escribir los elementos cuya posicion sea par
   for (posicion in listaPalabrasLargas.indices){
       if (posicion%2==0) println("Elemento en posicion par (con bucle for): "+listaPalabrasLargas[posicion])
   }

println("\n")

    //3. Hacer lo mismo pero con forEach
    listaPalabrasLargas.forEachIndexed { posicion, elemento ->
        if ( posicion % 2 == 0) println ("Elemento en posicion par (con bucle forEach): $elemento")
    }

    //4. Quiero que me escriba todos los elementos cuyo nombre contiene una letra a
    listaPalabrasLargas.forEach{ palabra ->
        if (palabra.contains('a')) println("\n El elemento que contiene la letra a es: $palabra") //deberia imprimir solo el cuatro
    }

println("\n")

    //5. Quiero que me escriban todos los elementos cuyo nombre contiene una letra "o" y no está ni en la primera ni en la última posicion
    listaPalabrasLargas.forEachIndexed { posicion, elemento ->
        if (elemento.contains('o') && posicion!=0 && posicion != listaPalabrasLargas.size-1){
            println("Elemento que contiene la letra o, y no esta en posiciones 0 o 6: $elemento")
        }
    }
}


