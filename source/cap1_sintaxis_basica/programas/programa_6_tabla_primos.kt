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


fun es_primo ( num : Int ) : Boolean {
    for (i in 2..num-1) {
        if (num % i == 0){
            return false
        }
    }
    return true
}

fun main ( argumentos : Array<String> ) {
    val max = leer_numero()
    for (num in 1..max) {
        if ( es_primo ( num ) ){
            println ("$num es primo")
        }
    }
}