fun main ( argumentos : Array<String> ) {
    print ( "Escribe un número:" )
    var cadN : String? = readLine()
    val n=cadN?.toIntOrNull()
    if ( n != null ) {
        var suma = 0
        for ( i in 1..n) {
            suma = suma + i
        }
        println ("La suma desde 1 hasta $n es $suma")
    }
}