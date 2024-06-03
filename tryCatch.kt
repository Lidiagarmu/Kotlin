fun main(args: Array<String>) {

    //null-safety ?

    var nombre: String? = null //String de tipo nulable
    println(nombre?.length) //devuelve null. No ejecuta el .length porque antes se de cuenta el compilador que la variable es null

    //Como no queremos que nos devuelva null, vamos a solucionar esto con nuestros TRYCATCH
    //debemos evitar el double bang !!
    var apellido: String? = null
    try {
        nombre!!.length // !!doublebang
    } catch (excepcion: NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error, cerrando aplicación")
    }

    //podemos asignar una variable a nuestro TRY

    val primerValor = 10
    val segundoValor = 0
    val resultado: Int = try {
        primerValor / segundoValor
    } catch (excepcion: Exception) {
        0
    }
    println(resultado) // imprime 0 porque lo capturamos en el catch, sino hubiera dado una error ArithmeticException por dividir entre 0

}


