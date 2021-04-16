fun main(){
    val nombreCompleto = NombreCompleto("Carlos","Tena")
    val mascota = Mascota("Moway","Europeo Común",12)
    mascota.setchip(123)
    val persona = Persona(nombreCompleto,mascota)
    persona.edad=39
    persona.setDni("12345678X")
    println(persona.toString())
}

class Persona(var nombreCompleto : NombreCompleto, var mascota: Mascota? = null){
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

    override fun toString(): String { //Sobreescribe el metodo String
        mascota?.let { return "${nombreCompleto.nombre} con DNI $DNI y soy dueño de...${it.nombreMascota}"
        } ?: run{
            return "${nombreCompleto.nombre} con DNI $DNI y no tengo mascota"
        }

    }

}

class NombreCompleto( var nombre: String,var apellido: String){

}

class Mascota  (var nombreMascota: String,var raza: String, var edadMascota: Int){
    private var numeroChip : Int? = null

    fun setchip (numeroChip: Int){
        this.numeroChip = numeroChip
    }
}

//Una mascota tiene una o ninguna mascota. La mascota tiene nombre, tiene especie y tiene unos años de edad y un numero de chip