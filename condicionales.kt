fun main (args: Array<String>) {


    // ESTRUCTURA DE CONTROL IF . Compara varias condiciones

    val nombre = "Maria"

    //el condigo entre llaves {} se ejecutará solo cuando el nombre no esté vacio
    if (nombre.isNotEmpty()) {
        println("La longiutd de nuestra variasble nombre es ${nombre.length}")
    } else { //else se ejecutará cuando isNotEmpty sea false
        println("Error, la variable está vacía")
    }


    val mensaje : String = if (nombre.length > 4) {
        "Tu nombre es largo!"
    } else if (nombre.isEmpty()){
        "Nombre está vacío"
    }
    else {
        "Tienes un nombre corto"
    }
    println(mensaje)

    /* estas sentencis if else if else podrían escribirse de la siguiente manera (aunque lo lógico es acortar código como
     en el anterior caso

    var mensaje : String
     if (nombre.length > 4) {
       mensaje = "Tu nombre es largo"
     } else {
       mensaje = "Tienes un nombre corto"
     }

     */


    // ESTRUCTURA DE CONTROL WHEN. Compara con una sola condicion y ejecuta varios códigos dependiendo del resultado de esa condición


    // EJEMPLO 1
    val nombreColor = "Amarillo"

    when (nombreColor) {
        "Amarillo" -> {
            println("El amarillo es el color de la alegría")
        } // se puede escribir el código entre llaves o no si es una sola instrucción como en el siguiente caso
        "Rojo", "Carmesí" -> println("Este color simboliza el calor") //rojo o carmesi
        else -> println("Error no tengo info del color ")
    }

    // EJEMPLO 2
    val code = 200
    when (code) {
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Codigo desconocido")
    }

    // EJEMPLO 3
    //si usamos when de forma similar a if debemos poner si o si la palabra clave else porque un entero tiene infinitas respuestas
    val tallaDeZapas = 41
    val respuesta = when (tallaDeZapas){
        41,43 -> "Tenemos disponibles"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento no tenemos disponibles"
        else -> "Estos zapatos solo vienen en tallas: 41, 42, 43, 44 y 45"
    }
}