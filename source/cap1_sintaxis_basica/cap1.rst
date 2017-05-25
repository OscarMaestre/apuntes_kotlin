:heading: value

.. contents:: Contenidos


Sintaxis básica
===================

Paquetes
---------------

La definición del paquete debe ir en la primera línea.

.. code-block:: kotlin

    package com.acme.aplicacion
    
Al contrario que en Java no es obligatorio que la estructura de directorios y la de paquetes coincida.

Funciones
-----------------

Las funciones llevan el tipo devuelto al final:

.. literalinclude:: programas/funcion_suma_1.kt
   :language: kotlin


Si una función no devuelve nada puede hacer dos cosas:

* Indicar que el tipo devuelto es ``Unit``.
* No indicar ningún tipo

Esta funcion imprime un mensaje:

.. literalinclude:: programas/funcion_imprimir_1.kt
   :language: kotlin

Y esta también (observar que no incluimos ``Unit``):

.. literalinclude:: programas/funcion_imprimir_2.kt
   :language: kotlin


Variables
--------------

Puede haber variables de solo lectura (es decir, constantes) o variables de lectura y escritura. En
cada variable se puede indicar el tipo, aunque Kotlin puede deducirlo y asignarle un tipo.

Una constante se puede definir de estas maneras:

.. code-block:: kotlin

    val a:Int = 3 //Creamos a de tipo Int y le asignamos 3
    val b=3      //Kotlin deduce que el tipo es un Int
    val c:Int    //Se crea C, pero aún no se ha inicializado
    c = 5        //En este punto se inicializa c
    c = 7        //Esto dará error.
    
Las variables son muy parecidas, pero las variables deben inicializarse. A continuación se muestran
algunas definiciones de variables (obsérvese que es casi el mismo código de antes):

.. code-block:: kotlin

    var a:Int = 3   //Creamos a de tipo Int y le asignamos 3
    var b=3         //Kotlin deduce que el tipo es un Int
    var c:Int       //Esto ahora sí da error
    var c:Int= 5    //En este punto se inicializa c
    c = 7           //Y esto ahora NO DARÁ ERROR.


Comentarios
------------------
Funcionan igual que en Java, usando /\* y \*/ o // para comentarios en una sola línea.


Cadenas
-------------
Son más potentes que en Java ya que usando el símbolo $ se puede "extraer" el contenido de una variable e imprimirlo.

Así, dado este programa

.. literalinclude:: programas/cadenas_basicas.kt
   :language: kotlin

El resultado que obtenemos es:

.. program-output:: java -jar cap1_sintaxis_basica/programas/cadenas_basicas.jar 
   :shell:
   
Decisiones con ``if``
---------------------

Funcionan exactamente igual que en Java aunque también pueden usarse como expresiones

Sentencias ``if`` al estilo Java:

.. code-block:: kotlin

    if (a>b){
        println ("a es mayor que b")
    }
    else {
        println ("a no es mayor que b")
    }
    
Decisiones como expresiones

.. code-block:: kotlin

    /*Si "a" es mayor que "b" el valor de "a" se
      asigna a "mayor". En caso contrario dentro
      de "mayor" se almacena el valor "b" */
    val mayor=if (a>b) a else b
    
Valores ``null``
--------------------------------------------------------------------

Las reglas para los tipos son un poco distintos de Java, en concreto examinemos
el código siguiente:

.. code-block:: kotlin

    var a:Int=3
    a=4
    /* Kotlin no permite esto,
       en a SOLO PUEDE HABER
       UN ENTERO*/
    a=null
    
Es decir, dado que ``null`` no es un Int, no se acepta el intentar almacenar ``null`` dentro de la referencia ``a``. Para permitir que un tipo sea nulo se debe usar una interrogación en el tipo, de la forma siguiente:

.. code-block:: kotlin

    var a:Int?=3
    a=4
    /* Esto ahora sí se permite*/
    a=null


El operador ``is`` y las conversiones de tipo (casts)
--------------------------------------------------------------------

En Kotlin, el operador ``is`` permite comprobar si una referencia es de un tipo dado, por ejemplo comprobar si es un ``String``. Si se usa ``is`` **ya no hace falta hacer ningún "cast"**.

.. code-block:: kotlin

    fun getLongitud(objeto : Any ) : Int?{
        if (objeto is String){
            //Aqui ya no hace falta usar un cast 
            val longitud=nombre.length()
            return longitud
        }
        //Si llegamos aquí, se supone que objeto
        //es del tipo Any y podríamos hacer
        //otra comprobación o quizá incluso
        //hacer esto
        return null
    }
    
Bucles
--------------------------------------------------------------------

Los bucles ``for`` y ``while`` funcionan igual que en Java

.. code-block:: kotlin

    //Esto construye una lista
    var elementos=listOf("manzana", "pera", "kiwi")
    for (elemento in elementos){
        println (elemento)
    }
    
    var elementos=listOf("manzana", "pera", "kiwi")
    var posicion=0
    while (posicion < elementos.size){
        println ("${elementos[posicion]}")
        posicion++
    }
    

Condiciones múltiples: ``when`` en lugar de ``switch``
--------------------------------------------------------------------

En Kotlin la sentencia ``switch`` no existe, pero en su lugar está ``when``, que es más flexible que su equivalente en Java.

.. code-block:: kotlin

    fun identificar(x:Int){
        when (x){
            42->{
                println ( "Es el 42" )
            }
            in (0..30)->{
                println ( "Está en el rango 0..30" )
            }
            else ->{
                println ( "No sé muy bien el rango de x" )
            }
        }
    }
    identificar (200)
    identificar (-4)
    
Rangos
--------------------------------------------------------------------

Se pueden usar rangos numéricos que junto a las operaciones ``in`` y ``!in`` permiten comprobar muy fácilmente si un número está en un rango dado.

.. code-block:: kotlin

    if (numero !in 1..10){
        println ("El número no está entre y 10)
    }
    
Operaciones de E/S básica
--------------------------------------------------------------------

Ya hemos visto que ``println`` permite escribir en pantalla. La sentencia ``readLine`` permite leer una línea del teclado. Dicha línea se devuelve como un ``String?``, es decir **si existe una línea, nos la devuelve, pero si no se pudo leer nada se nos devuelve un null**.

Una variante de ``println`` es ``print`` que escribe algo en una línea sin saltar despues a la siguiente.

Problemas propuestos
--------------------------------------------------------------------



Saludo
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~




*Escribir un programa que pregunte al usuario su nombre y despues le salude*

Una posible solución es esta:

.. literalinclude:: programas/programa_1_saludo.kt
   :language: kotlin


Saludo selectivo
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


*Modificar el programa anterior para que solo se salude con sus nombres a los usuarios Alice o Bob. El resto de personas simplemente verán el mensaje "Hola".*

.. literalinclude:: programas/programa_2_saludo_selectivo.kt
   :language: kotlin



Suma de números
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


*Escribir un programa que pida al usuario un número n e imprima la suma de números desde 1 hasta n*.

.. literalinclude:: programas/programa_3_sumas_n.kt
   :language: kotlin


Operaciones selectivas
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


*Crear un programa que pida al usuario un numero ``n`` y le ofrezca la posibilidad de hacer la suma o el producto de los valores comprendidos entre 1 y ``n``.*

.. literalinclude:: programas/programa_4_operaciones_selectivas.kt
   :language: kotlin


Tablas de multiplicar
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


*Escribir un programa que pida al usuario un número ``n`` y despues escriba la tabla de multiplicar de ese número*

.. literalinclude:: programas/programa_5_tablas.kt
   :language: kotlin

Números primos
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

*Escribir un programa que imprima todos los números primos hasta un cierto número ``n`` que se introduce por teclado*

.. literalinclude:: programas/programa_6_tabla_primos.kt
   :language: kotlin

Juego:adivina el número
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

*Crear un programa en el que la máquina piense un número entre 0 y 100. El jugador irá introduciendo números para intentar adivinarlo y el programa indicará si el usuario ha acertado. Si el usuario no acierta se deberá decir si el número secreto es mayor o menor. Permitir al usuario dar nuevos números hasta que acierte y cuando acierte decirle el número de intentos que ha necesitado. Si el usuario introduce dos o más veces seguidas el mismo número solo contará como un intento*

En este programa usaremos ``Random``, un objeto Java que permite generar números aleatorios. Para ello, deberemos usar el ``import`` correcto al principio del programa.

A continuación se muestra una solución. No se han introducido todas las comprobaciones para mantener el código en un tamaño que lo haga más comprensible.

.. literalinclude:: programas/programa_7_adivina_numeros.kt
   :language: kotlin

Write a program that prints the next 20 leap years.