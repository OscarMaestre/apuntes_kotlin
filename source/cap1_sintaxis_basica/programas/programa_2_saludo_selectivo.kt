fun main(argumentos:Array<String>){
    print ( "Escribe tu nombre:" )
    val nombre:String? = readLine()
    when (nombre){
        "Alice", "Bob" ->   { println ( "Hola $nombre") }
        else ->             { println ( "Hola ")        }  
    }
}