
fun main(args: Array<String>) {
    //funciones para ordenar listas (ordenar, convertir y filtrar)

    val numerosDeLoteria = listOf(11,22,43,56,78, 66)

    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosDeLoteria) //[11, 22, 43, 56, 78, 66]

    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)//[78, 66, 56, 43, 22, 11]

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos) //[56, 78, 66, 11, 22, 43] -> los mayores al principio y despues los menores de 50

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReverse = numerosDeLoteria.reversed()
    println(numerosEnReverse) //nuestra lista al revés

    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros) //[Tu numero de loteria es 11, Tu numero de loteria es 22, Tu numero de loteria es 43, Tu numero de loteria es 56, Tu numero de loteria es 78, Tu numero de loteria es 66]
    //pasa de enteros a String cadenas

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados) //[56, 78, 66]



}