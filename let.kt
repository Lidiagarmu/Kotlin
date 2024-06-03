fun main(args: Array<String>) {


    // SCOPE FUNCTION

    var nombre : String? = null
    nombre?.let {
        valor -> println("El nombre no es nulo, es $valor")
    }


    //funcion let ejecuta un codigo solo cuando nuestra variable no sea nula.
    //se usa junto con ? . Nos ayuda a evitar los NullPointedException
    nombre = "Lidia"
    nombre?.let {
        valor -> println("El nombre no es nulo, es $valor") //El nombre no es nulo, es Lidia
    }

}