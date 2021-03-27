/*
Tipos de datos opcionales: Null Safety,
Null Safety es la propiedad por el cual Kotlin nos ayuda
 a gestionar el uso de los valores null
 */

fun main(){

    //Declara una variable no null
    var nuncaNull: String = "Esta variable nunca es nula"

    //Intentamos asignar null a una variable no nula.SPOILER: Nos da erro de compilación
    //neverNull= Null

    //Declaramos una variable POSIBLEMENTE null
    var nombre: String? = "Tomás"// la ? es el nullsafety de kotlin, quiere decir que la variable nombre puede tener el valor de un tipo de dato String o valor nulo
    println(nombre)

    //Modificamos el valor de la variable "nombre" a null
    nombre = null
    println("$nombre, la variable ahora es un nulo")

    //Que pasa si no indicamos el tipo de variable que es
    var apellidos = "Kotlin deduce que esta variable no puede ser null"

    //Intenta asignar null a la variable apellidos
    //apellidos = null //esto provoca un error de compilacion

    //Declara otros tipos de datos
    var edad: Int? = null
    println("El valor de la edad es: $edad")
    edad = 15
    println("El nuevo valor de la edad es: $edad años")

    var altura: Double? = 1.82
    println("El valor de altura es: $altura metros")
    altura = null
    println("El nuevo valor de altura es: $altura")
    var cierto: Boolean? = null

    println("El valor del booleano es: $cierto")
    cierto=false
    println("El nuevo valor del booleano es: $cierto")
    cierto=true
    println("El nuevo valor del booleano es: $cierto")

    /*
    Pero, ¿para que sirve el null safety en kotlin?, tal y como su nombre indica
    esto sirve para asegurarnos de que los tipos de datos que manipulamos
    pueden ser null o no, esta propiedad de kotlin es una práctica muy
    recomendada y que ayuda a mejorar la calidad del código que escribimos
     */

}