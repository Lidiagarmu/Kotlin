fun main(args: Array<String>) {

    // SCOPE FUNCION
    //run -> ejecuta una serie de operaciones despues de declarar una variable

    val moviles = mutableListOf("Samsung", "Iphone", "Xiaomi")
        .run {
            removeIf { movil -> movil.contains("Iphone")}
            this
        }

    println(moviles) //[Samsung, Xiaomi]
}