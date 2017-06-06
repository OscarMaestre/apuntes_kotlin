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
    


Decisiones multiples con ``when``
----------------------------------


Bucles con ``for``
--------------------------


Bucles ``while``
-----------------------------



Ruptura de flujo: ``break`` y ``continue``
-------------------------------------------