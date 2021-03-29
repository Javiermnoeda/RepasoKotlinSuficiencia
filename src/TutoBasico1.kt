fun main(){
    //1. Declaracion de variables solo indicando el tipo
    val x: Int
    val esAzul: Boolean
    val apellidos: String


    //2. Declaracion de variables indicando el tipo de dato y el valor
    val a: Int = 1000
    val d: Double = 100.00
    val f: Float = 1000.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1


    //Dos formas de imprimir variables
    println("El valor de a es"+a)
    println("El valor de s es $s") //Es la forma mas estandarizada y la que kotlin recomienda

    //3. Declaracion de variables sólo indicando el valor. En estos dos casos Kotlin deduce el tipo de la variable en base al valor que le hemos dado, por ejemplo si le hemos puesto comillas, kotlin deduce que es una variable de tipo String
    val nombre = "Laia"
    val edad = 18

    //4. Intenta modificar alguna de las variables anteriores
    //edad = edad + 1 // esto provoca un error en tiempo de compilacion por que tal y como hemos definido las variables (con la palabra reservada val) no es posible mutar el valor de las variables que hemos creado
    //a = 13 // esto provoca un error en tiempo de compilacion

    //5. Intentar asignar null a alguna vriable
    // val marca: String = null // Esto provoca un error en tiempo de compilación, esto se debe a la propiedad nullSafety de kotlink (se verá mas adelante).

    //6. Val sirve para declarar variables de solo lectura, es decir, no mutables (constantes para los amigos).
    //Si queremos definir variables mutables debemos usar la palabra reservada var
    var sueldo = 3000
    sueldo = sueldo + 500
    //sueldo += 500, tambien se puede hacer asi (no lo habia visto en la vida, pero me gusta mas)
    println("$sueldo, como podemos ver, el valor de sueldo a cambiado de 3000 a 3500")

    var contador = 0
    contador++
    contador.plus(1) // contador++, pero es la opción recomendada por kotlin (usar siempre la de arriba)
    println("$contador, como podemos se ha sumado 1 al valor del contador")

    /*
    7. ¿Cuando hay que usar val o var? En realidad podemos usar siempre var y no habria
    problemas en el proyecto, pero la realidad es que la programacion es un trabajo que
    se realiza en equipo y las constantes sirven para darle semántica al código que escribimos.
    En la práctica, si tenemos un proyecto de cientos de miles de lineas de código,
    el poder saber de un vistazo si una variable mutará o no a lo largo del código
    es muy útil para el resto del equipo que trabaja en el mismo proyecto.
     */



}