fun main (args: Array<String>) {

    // SCOPE FUNCTION
    // apply -> permite realizar operaciones sobre una variable y despues devolver el valor. Apply acepta valores null
    //aconsejable usar apply para convertir variables null a variables con valores.


    val moviles = mutableListOf("Samsung", "Iphone", "Xiaomi").apply {
        removeIf { movil -> movil.contains("Samsung")}
    }
    println(moviles) //[Iphone, Xiaomi]

    val colores : MutableList<String>? = mutableListOf("amarillo", "azul", "rojo")
    colores?.apply {
        println("Nuestro colores son $this")
        println("Cantidad de colores es $size")
    }





}