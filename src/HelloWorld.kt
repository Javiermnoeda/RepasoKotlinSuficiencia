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

}


