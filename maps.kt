fun main(args: Array<String>) {

    //mapas inmutables
    val edadDeSuperheroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperheroes)

    //mapas mutables
    val edadDeSuperheroesMutables = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperheroesMutables)

    //agregar superheroes dos formas:

    edadDeSuperheroesMutables.put("Wolverine", 45)
    println(edadDeSuperheroesMutables)

    edadDeSuperheroesMutables["Storm"] = 30
    println(edadDeSuperheroesMutables)

    //obtener un valor del mapa

    val edadIronman = edadDeSuperheroesMutables["Ironman"]
    println(edadIronman) //35

    //eliminar elementos del mapa

    edadDeSuperheroesMutables.remove("Wolverine")
    println(edadDeSuperheroesMutables)

    //obtener todas las claves y valores

    println(edadDeSuperheroesMutables.keys) //[Ironman, Spiderman, Capitan America, Storm]

    println(edadDeSuperheroesMutables.values) //[35, 23, 99, 30]

}