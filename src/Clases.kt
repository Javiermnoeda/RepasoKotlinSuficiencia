fun main(){
    val nombreCompleto = NombreCompleto("Carlos","Tena")
    val persona = Persona(nombreCompleto)
    persona.edad=39
    persona.setDni("12345678X")
    println(persona.toString())

    val profesor = Profesor(NombreCompleto("Alfredo","XI"),111111L)
    profesor.numeroLicencia
    println(profesor.toString())

    val secretario = Secretario(NombreCompleto("Juanjo","V"))
    secretario.apuntaCita()

    val alumno = Alumno(NombreCompleto("Rodrigo","Santos"))
    alumno.copiarExamen()

    val lista = listOf(profesor,secretario,alumno)
    lista.forEach {
        it.saludar()
    }
}

open class Persona(var nombreCompleto : NombreCompleto){
    // edad es publica, no pongo restricciones a que lo cambien
    var edad = 18
    private var DNI : String? = null

    //Si el DNI private me interesa poner un get y un set
    //Para poder cambiar el DNI que en este caso es una variable privada, necesitamos crear una funcin que sea SET
    fun setDni(DNI: String) {
        if (DNI.length == 9 && DNI[DNI.length-1].isLetter()){
            this.DNI = DNI
        }
    }

}

class NombreCompleto( var nombre: String,var apellido: String){

}

//Herencia
class Profesor(nombre : NombreCompleto, var numeroLicencia: Long) : Persona(nombre), PuedeSaludar{
    override fun toString(): String {
        return("Soy ${nombreCompleto.nombre} y mi número de licencia es $numeroLicencia")
    }
    override fun saludar() {
        println("Buenos alumnos que tal")
    }
}

class Alumno(nombre: NombreCompleto) : Persona(nombre), PuedeSaludar{
    override fun saludar() {
        println("Heyyyy que pasa bro")
    }

     fun copiarExamen(){
        println("Me voy a copiar")
    }
}

class Secretario(nombre : NombreCompleto) : Persona(nombre), PuedeSaludar {
    override fun toString(): String {
        return("Soy el secretario ${nombreCompleto.nombre}")
    }

    override fun saludar() {
        println("Soy el secretario y te saludo")
    }

    fun apuntaCita(){
        println("Okay, he apuntado la cita")
    }

}

interface PuedeSaludar{
    fun saludar()
}
