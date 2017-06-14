
fun main ( argumentos : Array<String> ) {
    val valor : Int = 2
    when ( valor ) { 
        1    -> { println ( "El valor era 1" )    }
        2    -> { println ( "El valor era 2" )    }
        else -> { println ( "Valor desconocido" ) }
    } //Fin del when
    println ( "Fin de la ejecución" )
}