import java.util.Calendar;

fun esDivisiblePor ( cantidad : Int, divisor : Int = 4 ) : Boolean  {
    return ( cantidad % divisor == 0 )
}

fun esBisiesto ( anio : Int ) : Boolean {
    val divisiblePor4 : Boolean = esDivisiblePor ( anio, 4)
    val divisiblePor100 : Boolean = esDivisiblePor ( anio, 100 )
    val divisiblePor400 : Boolean = esDivisiblePor ( anio, 400 )
    
    val resultado = divisiblePor4 && (!divisiblePor100 || divisiblePor400)
    return resultado
}

fun main ( argumentos : Array<String> ) {
    val fechaActual : Calendar = Calendar.getInstance()
    var anioActual = fechaActual.get ( Calendar.YEAR )
    println ("El año actual es $anioActual")
    var contadorBisiestos = 0
    while (contadorBisiestos <= 20) {
        if ( esBisiesto ( anioActual ) ) {
            println ("$anioActual es bisiesto")
            contadorBisiestos ++
        }
        anioActual++
    }
}