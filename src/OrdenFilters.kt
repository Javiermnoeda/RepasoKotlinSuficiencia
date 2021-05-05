
var l1 = mutableListOf("Carlos", "Sergio", "Javier", "Ignacio","Manuel", "Stefanel", "Néstor")
val listaVocales = mutableListOf("a", "e", "i", "o", "u")

class Humano(var nombre: String, var edad: Int)
var l2 = mutableListOf(Humano("Carlos", 33), Humano("Sergio", 20), Humano("Javier", 21), Humano("Ignacio", 22),Humano("Manuel", 23), Humano("Stefanel", 24), Humano("Néstor", 25))

class HumanoComparable(var nombre: String, var edad: Int) : Comparable<HumanoComparable>{
    override fun compareTo(other: HumanoComparable): Int {
        return edad - other.edad
    }

    override fun toString(): String {
        return "$nombre de $edad años"
    }
}

var l3 = mutableListOf(HumanoComparable("Carlos",33),HumanoComparable("Sergio",20),HumanoComparable("Javier",21),HumanoComparable("Ignacio",22),HumanoComparable("Manuel",23),HumanoComparable("Stefanel",24),HumanoComparable("Néstor",25))



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

    //Ordenación

    //Sort: Atentos que aquí no devuelve otra lista sino que ordena la original
    //Lista ordenada alfabéticamente
    l1.sort()
    println("Lista ordenada alfabéticamente $l1")


    //Sorted: Atento que este si devuelve otra lista
    //Lista ordenada Alfabéticamente
    val o1 = l1.sorted()
    println("Lista ordenada alfabéticamente tambien (pero con sorted)$o1")

    //SortBy
    //Lista ordenada por longitud del nombre
    l1.sortByDescending { it.length }
    println("Lista ordenada por longitud de nombre es: $l1")

    /*
    Sobre l2 NO nos deja hacer un sort. Esto es por que Humano no es una clase "comparable"
    l2.sort()
     */

    //Sobre l3 SI que nos deja hacer un sort
    l3.sort()
    println("La lista ordenada por edad es:  $l3")

}

fun contarVocales (s: String):Int{
    var out = 0

    s.toLowerCase().forEach {
        if (listaVocales.contains(it.toString())) out++
    }
    return out
}

