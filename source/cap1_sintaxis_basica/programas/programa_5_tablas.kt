fun leer_numero() : Int {
    print ( "Introduzca un número:" )
    val linea : String? = readLine()
    val numero : Int? = linea?.toIntOrNull();
    val num_para_devolver : Int
    if (numero==null){
        println ( "No se introdujo un número, asumiendo el valor 1")
        num_para_devolver = 0
    } else {
        num_para_devolver = numero.toInt()
    }
    return num_para_devolver
}


fun imprimir_tabla ( numero : Int ) {
    println ("Imprimiendo la tabla del $numero")
    for (i in 1..10){
        val resultado = i * numero
        println ("$i * $numero = $resultado")
    }
}

fun main ( argumentos : Array<String> ){
    val numero = leer_numero()
    imprimir_tabla ( numero )
}