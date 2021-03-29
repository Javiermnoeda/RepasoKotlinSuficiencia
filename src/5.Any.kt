/*
    El tipo Any es lo que Object a Java
    Any es el supertipo de todos los tipos en kotlin
 */


fun main(){
    //1. Crea distintas variables de tipo Any
    val x: Any = 2
    val nombre: Any = "Antonio"

    //2. Crea distintas variables de tipo Any?
    val y: Any? = 2
    val apellidos: Any? = null

    val numeros = listOf<Any?>(15,"20",30.6,"cien", false, null)

    //Any puede servir, por ejemplo, para crear listas de cualquier tipo de dato

    /*
        En definitiva Object es la super clase de todas las clases en Java, mientras que
        Any es la super clase de todas las clases NO OPCIONALES en kotlin
        Any? si queremos también usar el valor null
     */
}