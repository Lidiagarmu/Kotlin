fun main(args: Array<String>) {

    //SETS -> no pueden tener elementos repetidos

    //sets inmutables

    val vocalesRepetidas = setOf("a","e","i","o", "u","a","e","i","o", "u")
    println(vocalesRepetidas) //[a, e, i, o, u]

    //sets mutables

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos) //[1, 2, 3, 4, 5]

    numerosFavoritos.remove(5)
    println(numerosFavoritos) //[1, 2, 3, 4]

val valorDeTest = numerosFavoritos.firstOrNull { numero -> numero > 2 }
    println(valorDeTest) //3



}
