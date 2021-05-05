
var l1 = mutableListOf("Carlos", "Sergio", "Javier", "Ignacio","Manuel", "Stefanel", "Néstor")
val listaVocales = mutableListOf("a", "e", "i", "o", "u")

fun main() {


    println("Lista original = $l1")

    /*
    // Filtrado
    val r1 = l1.filter { true }
    println(r1)

    val r2 = l1.filter {
        it.startsWith("C")
    }
    println(r2)
     */

    // Ej1: Busca a todas las personas que no se llaman Sergio pero que tienen una "s" en su nombre.
    val r3 = l1.filter {
        it.toLowerCase().contains("s") && !it.contentEquals("Sergio")
    }
    println("Personas que no se llaman Sergio pero que tienen una s en su nombre: $r3")

    // Ej2: Busca a todas las personas cuyo nombre tiene un número de letras par.
    val r4 = l1.filter {
        it.length % 2 == 0
    }
    println("Personas cuyo nombre tiene un numero de letras par: $r4")

    // Ej3: Busca a todas las personas cuyo nombre tiene un número de letras superior a 6 y que su nombre empieza por vocal.
        val r5 = l1.filter { nombre ->
            var empiezaVocal = false
            listaVocales.forEach{ vocal ->
                if (nombre.startsWith(vocal, true)) empiezaVocal = true
            }
            nombre.length > 6 && empiezaVocal
        }
        println("Personas cuyo nombre numero de letras es superior a 6 y que su nombre empieza por vocal: $r5")

    // Ej4: Busca a todas las personas cuyo nombre tiene que tengan más de 3 vocales distintas.
    val r6 = l1.filter {
        contarVocales(it) >= 3
    }
    println("Personas cuyo nombre tiene mas de 3 vocales distintas: $r6")

    // Orden
    l1.sort()
    println(l1)
}

fun contarVocales (s: String):Int{
    var out = 0

    s.toLowerCase().forEach {
        if (listaVocales.contains(it.toString())) out++
    }
    return out
}

