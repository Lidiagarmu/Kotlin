
    //  INTRODUCCIÓN A KOTLIN
    // En Kotlin todas las variables son objetos. Al escribir el nombre de la variable despues de haberla creado y haberle asignado valor, podemos nombrarlo y usar diferentes funciones


    // VARIABLES CONSTANTES. Se escriben fuera de la función
    //declaradas en tiempo de compilación
    //es una variante de las variables de solo lectura, se definen fuera de la función.
    //const val --> son usadas para valores que nunca cambian

    const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    // VARIABLES LECTURA Y ESCRITURA
    // var --> el valor puede cambiar

    var dinero : Int = 10
    println(dinero)
    dinero = 5
    println(dinero)

    // VARIABLES SOLO LECTURA
    // val --> Una vez asignado el valor, no puede cambiar
    //declaradas en tiempo de ejecución

    val nombre = "Maria"
    println(nombre)
    println(PI)


    // TIPOS DE VARIABLES
    // el tipo se puede suprimir en todos ellos ej. val boolean = true
    // los tipos son cualquier propiedad que puede tener un objeto

    val boolean : Boolean = true
    val numeroLargo : Long = 30000000000000000 // o también 3L
    val double : Double = 2.213
    val float : Float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor) //si presionamos cmd + b sobre minus nos lleva a la declaraciones de las funciones de los tipos primitivos
    //en vez de la linea anterior seria lo mismo:  val tercerValor = primerValor - segundoValor
    println(tercerValor)


    val apellido = "Sanz"
    val lidia = "Lidia"
    val nombreCompleto = "Mi nombre es $lidia $apellido" //es lo mismo que: lidia + " " + apellido
    println(nombreCompleto)

    // OPERACIONES MAS UTILIZADAS

    /*          Expresión	 Función	Operator Fun
                    a + b	c = a + b	public operator fun plus(other: Int): Int
                    a - b	c = a - b	public operator fun minus(other: Int): Int
                    a * b	c = a * b	public operator fun times(other: Int): Int
                    a / b	a = a / b	public operator fun div(other: Int): Int
                    a % b	c = a % b	public operator fun rem(other: Int): Int
                    a++ 	c = a++	    public operator fun inc(): Int
                    a–	    c = a–	    public operator fun dec(): Int
                    a > b	c = a > b	public override operator fun compareTo(other: Int): Int
                    a < b	c = a < b	public override operator fun compareTo(other: Int): Int
                    a >= b	c = a >= b	public override operator fun compareTo(other: Int): Int
                    a <= b	c = a <= b	public override operator fun compareTo(other: Int): Int
                    a != b	c = a != b	public open operator fun equals(other: Any?): Boolean
*/

    /* OO vs Funcional

    OO --> Encapsulación, abstración, polimorfismo y herencia
    Funcional --> Funciones puras, funciones de primera clase, datos inmutables y transparencia referencial


    */

}