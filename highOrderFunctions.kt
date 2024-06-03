fun main(args: Array<String>) {

    val largoDeValorInicial = superFuncion(valorInicial = "Hola", block = {valor ->
        valor.length
    })

    println(largoDeValorInicial) // imprime 4, la longitud de Hola


val lambda : () -> String = funcionInception("Enrique")
val valorLambda : String = lambda()
    println(valorLambda) // imprime Hola desde la lambda Enrique

}

//super funcion. una funcion lambda dentro de una funcion

fun superFuncion (valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)

    //si queremos obtener una funcion de una funcion


}


fun funcionInception (nombre : String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}