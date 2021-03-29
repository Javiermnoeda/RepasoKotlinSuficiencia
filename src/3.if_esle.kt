//ESTRUCTURA DE CONTROL
fun main (args: Array<String>){
    var a: Int = 5
    var b: Int = 3

    var max: Int

    if (a > b){
        max = a
    } else {
        max = b
    }
    println("El máximo de a o b es $max")

    //Como expresion otra forma de escribir las lineas de 8 a 12 es
    val max2 = if (a > b) a else b // si a fuese mayor que b, max valdria a y si no, max valdria b

    //Escribe codigo if/else usando WHEN. WHEN es una estructura de control en kotlin que se parace mucho al Switch Case.

    val x: Int = 5
    when (x) {
        1 -> {
            println("caso 1")
            println("x es 1")
        }
        2 -> {
            println("caso 2")
            println("x es 2")
        }
        else -> {
            println("x no es ni 1 ni 2")
        }
    }
    //when es lo mismo que un if pero diferente 
}