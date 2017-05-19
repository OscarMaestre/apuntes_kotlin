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
Son más potente que en Java ya que usando el símbolo $ se puede "extraer" el contenido de una variable e imprimirlo.

Así, dado este programa

.. literalinclude:: programas/cadenas_basicas.kt
   :language: kotlin

El resultado que obtenemos es:

.. program-output:: java -jar cap1_sintaxis_basica/programas/cadenas_basicas.jar 
   :shell:
   
