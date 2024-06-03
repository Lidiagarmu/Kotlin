 fun main(args: Array<String>) {

     // el operador elvis: asigna un valor por defecto a una variable en caso de que el resultado haya sido null
     // con este operador nos aseguramos de que siempre nos devuelva un valor por defecto

     var nombre : String? = null
     val caracteresDeNombre : Int = nombre?.length ?: 0 //tomará el valor derecho del elvis operator siempre que sea nulo
                                                        // por ello lo convierte a entero porque el valor asignado por defecto es 0

     println(caracteresDeNombre)


 }
