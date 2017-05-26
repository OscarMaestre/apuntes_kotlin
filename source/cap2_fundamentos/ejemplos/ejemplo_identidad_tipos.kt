fun main ( argumentos : Array<String> ) {
    val a1 : Int     = 4242
    val b1 : Int     = a1
    val a2 : Int?    = a1
    val b2 : Int?    = a1
    
    if ( a1 == b1 )
        println ( "a1 y b1 tienen el mismo valor ($a1==$b1)" )
    if ( a2 == b2 )
        println ( "a2 y b2 tienen el mismo valor ($a2==$b2)" )
    
    if ( a1 === b1 )
        println ( "a1 y b1 apuntan al mismo valor almacenado en memoria" )
    if ( a2 === b2 )
        println ( "a2 y b2 apuntan al mismo valor almacenado en memoria" )
    //Esta comparación nunca es fiable
    if ( ! ( a2 === b2) )
        println ( "a2 y b2 NO apuntan al mismo valor almacenado en memoria" )
    
}