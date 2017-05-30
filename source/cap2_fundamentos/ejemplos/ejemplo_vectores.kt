fun imprimirVector ( vector : Array<Int> ) {
    for (i in vector) {
        println ( "$i" )
    }
}

fun main ( argumentos : Array<String>) {
    val vectorEnteros = arrayOf(42,100)
    imprimirVector ( vectorEnteros )
    
    /* Se crea un vector de tamaño 10 y
    se hará un bucle desde 0 hasta 9. Para
    cada pos se genera un elemento en el
    vector cuyo valor es el doble de pos*/
    val vectorEnteros2 = Array ( 10,{  pos -> pos*2 } ); 
    imprimirVector(vectorEnteros2)
}
