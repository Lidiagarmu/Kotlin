fun main (args: Array<String>) {

    // WHILE

    var contador = 10 // usamos var porque el valor de contador se irá modificando
    while(contador >0){
        println("El valor del contador es $contador")
        contador--

    }

    // DO-WHILE

        //mientras sea mayor de 50 se ejecutará cuando sea menor saldrá del bucle
    do {
        println("Generando numero aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El número generado es: $numeroAleatorio")
        } while(numeroAleatorio>50)

     // FOR

    val listaDeFrutas = listOf("Manzana", "Pera", "Limón", "Fresa")
    for (fruta in listaDeFrutas) {
        println("Hoy voy a comerme una fruta llamada $fruta")

    }

    //FOR EACH

    listaDeFrutas.forEach{ fruta ->println ("Hoy voy a comerme una fruta nueva se llama $fruta")}

    // función .map


    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    // función filter

    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
}