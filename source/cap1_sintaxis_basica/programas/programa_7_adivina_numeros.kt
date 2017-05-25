//Se pueden importar clases Java y usarlas
//de la manera habitual
import java.util.Random;

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


fun main (argumentos : Array<String>) {
    //Generamos el número al azar
    val generadorNumerosAleatorios : Random = Random()
    //Se elige un número entre 0 y 99
    val numeroElegido = generadorNumerosAleatorios.nextInt(100)
    println ("Acabo de elegir un número entre 0 y 100. ¡Adivínalo!")
    var contadorIntentos : Int = 0
    /* Se necesita almacenar el número que
       introdujo el usuario en una vez anterior
       para que si lo vuelve a introducir no
       se contabilice el intento */
    var numeroAnteriorUsuario : Int = -1
    var numeroUsuario : Int
    do {
        numeroUsuario = leer_numero()
        if ( numeroUsuario == numeroAnteriorUsuario ) {
            println ("Ya introdujiste $numeroUsuario")
            continue
        }
        //Si se llega aquí no ha elegido un número repetido
        numeroAnteriorUsuario = numeroUsuario
        contadorIntentos++
        if ( numeroUsuario == numeroElegido){
            break
        }
        if ( numeroElegido < numeroUsuario ){
            println ("No, el número que he elegido es menor")
        }
        if ( numeroElegido > numeroUsuario ){
            println ("No, el número que he elegido es mayor")
        }
    } while (numeroUsuario != numeroElegido)
    println ("Acertaste. Efectivamente elegí el $numeroElegido")
    println ("Has necesitado $contadorIntentos intentos")
}