:heading: value

.. contents::

Sentencias del lenguaje
==============================

Muchas de las sentencias de Kotlin funcionan de manera muy parecida a Java, por lo que si se ha manejado este lenguaje previamente será muy sencillo acostumbrarse a ellas. A continuación se muestran las operaciones básicas del lenguaje

Decisiones con ``if``
-----------------------

Los if funcionan como en Java:

* Se puede hacer un if-then y un if-then-else.
* La comprobación siempre va entre paréntesis.
* La comprobación puede ser muy compleja y se debe poner cada comprobación con su propio paréntesis.

Sin embargo, en Kotlin el ``if`` es **una expresión**. Eso significa que el ``if`` se evalúa y *de dicha evaluación se obtiene un resultado*. Por lo tanto se puede meter dentro de una variable el resultado de un ``if``, como muestra el siguiente código.

.. code-block:: kotlin

    val n1 : Int = 2
    val n2 : Int = 3
    //Aquí se almacena el número mayor
    val mayor : Int = if ( n1> n2 ) n1 else n2
    println ( "El mayor es $mayor" )

Se puede seguir usando el ``if`` al estilo Java:

.. code-block:: kotlin

    val n1 : Int = 2
    val n2 : Int = 3
    //Aquí se almacena el número mayor
    var mayor : Int = 0
    if ( n1 > n2 ) mayor = n1 else mayor = n2
    println ( "El mayor es $mayor" )
    
Y por supuesto se pueden usar llaves para realizar tareas complejas:

.. code-block:: kotlin

    val n1 : Int = 2
    val n2 : Int = 3
    //Aquí se almacena el número mayor
    var mayor : Int = 0
    if ( n1 > n2 ) {
        mayor = n1
    }
    else {
        mayor = n2
    }
    println ( "El mayor es $mayor" )
    
Además, dentro del ``then`` o del ``else`` puede haber un bloque grande de código siempre y cuando la última línea del bloque sea un valor.

.. code-block:: kotlin
    
    val mayor : Int = if ( a > b ) {
                            println ("a es el mayor")
                            a
                        }
                        else {
                            println ("a es el mayor")
                            b
                        }



Decisiones multiples con ``when``
----------------------------------

En Kotlin no existe el ``switch/case`` de Java. El equivalente es la sentencia/expresión ``when``. En líneas generales, ``when`` actúa como el ``switch`` de Java pero con una mayor potencia.

De entrada, se pueden hacer comprobaciones simples.

.. code-block:: kotlin

    val valor : Int = 2
    when ( valor ) { 
        1    -> { println ( "El valor era 1" )    }
        2    -> { println ( "El valor era 2" )    }
        else -> { println ( "Valor desconocido" ) }
    } //Fin del when

Sin embargo, podemos usar expresiones más complejas. Por ejemplo, se puede comprobar si ``valor`` es un elemento u otro (comprobación ``or``) usando la coma (",").

También se puede comprobar si un valor está en un conjunto o no usando ``in`` o ``!in``, comprobar si es una instancia de una clase con ``is`` o en general usar cualquier comprobación que dé como resultado un ``boolean``. De hecho, ni siquiera es obligatorio que al lado del ``when`` aparezca un valor.

Obsérvese que antes hemos dicho "sentencia/expresión" y es que puede usarse de ambas maneras. En

Bucles con ``for``
--------------------------

Aunque ya hemos visto algunos bucles hasta ahora usaremos este apartado para formalizar el uso de bucles ``for``. La sentencia ``for`` puede iterar a través de cualquier objeto que proporcione un ``iterator``, como por ejemplo:

* Un método llamado ``iterator()`` que devuelva objetos de un tipo que tenga un método ``next()`` y además tenga un método ``hasNext()`` que devuelva un ``boolean``.

* Los tres métodos ``iterator``, ``next`` y ``hasNext`` deben haber sido marcados con ``operator`` (más sobre esto más adelante)

En general para recorrer los elementos de un array se pueden hacer tres cosas

* Recorrer los objetos del array.
* Recorrer las posiciones del array y recuperar los objetos nosotros mismos (se puede usar la propiedad ``indices`` de los arrays.)
* Recorrer el array obteniendo posiciones y objetos a la vez con ``withIndex``.

A continuación mostramos un ejemplo de los tres.

Bucles ``while``
-----------------------------



Ruptura de flujo: ``break`` y ``continue``
-------------------------------------------