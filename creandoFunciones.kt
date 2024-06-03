fun main(args: Array<String>) {

    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)

    imprimirNombre(nombre = "Lidia", apellido = "Garcia")


}


//parametros nombrados y asignacion valor por defecto

fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String) {
println("Mi nombre completo es $nombre $apellido")
}


//funcion imprimir frase

fun imprimirFrase(frase: String) : Unit {
    println("Tu frase es: $frase")
}

//convertir una frase a mayus o minus dependiendo de un numero aleatorio

fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0 ){
        return this.toUpperCase()
        } else {
            return this.toLowerCase()
    }


    //random(),toUpperCase() y tolowerCase() son funciones de extension
    //String.randomCase -> funcion de extension que hemos creado gracias a String.



}