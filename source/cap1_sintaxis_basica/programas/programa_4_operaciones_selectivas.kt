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

fun sumar ( limite : Int ) : Int {
    var suma=0
    for (i in 1..limite) suma = suma + i
    return suma
}

fun multiplicar ( limite : Int ) : Long {
    var multiplicacion : Long  = 1
    for (i in 1..limite) multiplicacion = multiplicacion * i
    return multiplicacion
}

fun main ( argumentos : Array<String> ){
    val numero = leer_numero()
    println ( "Introduzca + para sumar y * para multiplicar")
    val operacion = readLine()
    when ( operacion ) {
        "+" -> {
            val suma = sumar ( numero )
            println ( "Introdujo + y la suma desde 1 hasta $numero es $suma")
        }
        "*" -> {
            val multiplicacion = multiplicar( numero )
            print   ( "Introdujo * y la multiplicacion" )
            println ( "desde 1 hasta $numero es $multiplicacion")
        }
        else -> {
            val suma = sumar ( numero )
            println ( "Opcion desconocida, asumiendo suma" )
            println ( "La suma desde 1 hasta $numero es $suma")
        }
    }
}