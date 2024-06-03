fun main (args: Array<String>) {

    // SCOPE FUNCTIONS
    //also: permite obtener una variable, despues ejecutar un codigo con esa variable y luego devolverla como parametro para que pueda ser
    //utilizada por una funcion mas adelante

    val moviles = mutableListOf("Samsung", "Iphone", "Xiaomi").also {
        lista -> println("El valor original de la lista es $lista")
    }.asReversed()

    println(moviles)
/*El valor original de la lista es [Samsung, Iphone, Xiaomi]
[Xiaomi, Iphone, Samsung]*/
}
