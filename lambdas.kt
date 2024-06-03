fun main(args: Array<String>) {



//funciones anonimas -> lambdas

    val myLambda : (String) -> Int = {
        valor -> valor.length
    }
    val lambdaEjecutada = myLambda("Hola Platzi")
    println(lambdaEjecutada) //imprime 11



    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos) // imprime [5, 4, 4]
}


