fun main(args: Array<String>) {

    // SCOPE FUNCTION
    //la funcion with nos ayuda a acceder directamente a las propiedades de la variable que le pasamos como parametro o a la misma variable utilizando this

    val colores = listOf("azul", "amarillo", "rojo")
    with(colores) {
        println("Nuestros colores son $this") //Nuestros colores son [azul, amarillo, rojo]
        println("Esta lista tiene una cantidad de colores de $size") // Esta lista tiene una cantidad de colores de 3Esta lista tiene una cantidad de colores de 3
        //este ultimo print es posible porque estamos dentro del scope de la funcion with
        //lo que nos permite acceder a las propiedades de colores sin necesidad de estar llamando a la variable
    }

}