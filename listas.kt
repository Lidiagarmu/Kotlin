fun main(args: Array<String>) {

    // listas INMUTABLES

    val listaDeNombres = listOf("Ana","Pedro","Ivan","Lidia") // decirle el tipo de dato es redundante listOf<String>, Kotlin ya sabve que son Strings
    println(listaDeNombres)
    // listaDeNombre.remove --> no me va a dejar porque este tipo de lista son inmutables

    // listas MUTABLES

    val listaVacia = mutableListOf<String>() //como esta lista no tiene valores asignados si que hay que especificar el tipo de datos que contendrá
    println(listaVacia)

    listaVacia.add("Laura")
    listaVacia.add("Jon")
    println(listaVacia) //[Laura, Jon]

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)//Laura

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador) //Laura

    val primerValor = listaDeNombres.first()
    println(primerValor) //Ana

    listaVacia.removeAt(1)
    println(listaVacia) //[Laura]

    listaVacia.add("Enrique")
    listaVacia.add("Ben")
    println(listaVacia) //[Laura, Enrique, Ben]
    listaVacia.removeIf { caracteres -> caracteres.length > 3}
    println(listaVacia) //[Ben]


    // ARRAY en Kotlin

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array $myArray") //nos devuelve el codigo en bytecode -> Nuestro array [Ljava.lang.Integer;@4db6661a
    println("Array como lista ${myArray.toList()}") // Array como lista [1, 2, 3, 4]
}