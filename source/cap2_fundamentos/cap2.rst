:heading: value

.. contents::

Fundamentos del lenguaje
==============================


Objetos
--------------------------------------------------------------------

En Kotlin todo es un objeto y por lo tanto sobre cualquier variable se pueden consultar propiedades o ejecutar métodos. Por ejemplo, este código es válido en Kotlin

.. code-block:: kotlin

    "Hola".length()
    
Si se conoce Ruby es muy posible que se haya reconocido la influencia de este lenguaje en Kotlin.

Encapsulación ("boxing")
--------------------------------------------------------------------

Kotlin utiliza tanto sus propios tipos como los tipos de Java definidos en la máquina virtual JVM. Por ejemplo, las variables de tipo ``Int`` se almacenan a nivel interno como un tipo Java en la JVM pero las variables de tipo ``Int?`` (recordemos, sí aceptan valores ``null``) en realidad se encapsulan en tipos de Kotlin.

Esto significa que podemos comparar los valores de un tipo ``Int`` y de uno ``Int?`` sin tener ningún problema pero *no debemos comparar la identidad de dos variables de distinto tipo,  ya que podemos obtener un valor falso*

Si ejecutamos el siguiente programa:

.. literalinclude:: ejemplos/ejemplo_identidad_tipos.kt
   :language: kotlin
   
Obtendremos el siguiente resultado
   
.. program-output:: java -jar cap2_fundamentos/ejemplos/ejemplo_identidad_tipos.jar

De hecho, ni siquiera es posible compilar la comparación de variables de tipos distintos

.. code-block:: kotlin

    var respuesta1 : Int?  = 42
    var respuesta2 : Long? = 42
    //El compilador se queja en esta línea
    if ( respuesta1 == respuesta2 ) println ( "Respuestas iguales" )

Tipos numéricos
--------------------------------------------------------------------


Los números funcionan de forma similar a los números en Java pero con una diferencia importante.

.. WARNING::
   Kotlin no hace conversiones implícitas entre tipos ni siquiera cuando intentemos almacenar valor un tipo pequeño (como ``Byte``) dentro de un tipo más grande (como ``Int``). Es difícil que se produzcan error porque el código erróneo ni siquiera compilará.
   
Así, este código falla

.. code-block:: kotlin

    val unByte : Byte = 12
    val unInt : Int = unByte

Y este código también falla

.. code-block:: kotlin

    val a : Int? = 3
    val b: Long? = 10L
    val c = a + b
    
Visto esto, los tipos básicos en Kotlin son los siguientes:

* ``Double``, para números con decimales de doble precisión.
* ``Float``, para números con decimales de precisión simple.
* ``Long``, para números enteros largos.
* ``Int``, para números enteros.
* ``Short``, para números enteros cortos.
* ``Byte``, para números enteros muy cortos.

Cuando se almacenan valores en una variable o constante se usan los mismos sufijos que en Java. También se incluye la posibilidad de usar el guión bajo ("_") como separador
en números sin que eso afecte al número:

.. code-block:: kotlin

    val unLong              : Long  = 42L
    val unLongEnHexadecimal : Long  = 0xCAFB
    val unIntEnBinario      : Long  = 0b010010100101
    val diezMillones        : Long  = 10_000_000
    val unDouble            : Double= 6.02e23
    val unFloat             : Float = 42.42f


Además, todos los tipos numéricos ofrecen métodos para poder convertir entre distintos tipos:

* ``toDouble()``
* ``toFloat()``
* ``toLong()``
* ``toInt()``
* ``toShort()``
* ``toByte()``
* ``toChar()``

Además, todos tipos numéricos ``Int `` y ``Long`` soportan operaciones a nivel de bit. Incluso algunas funciones pueden usarse como operadores en lugar de tipo. Las operaciones a nivel de bit son:

* ``shl(cantidadDeBits)``. De Signed Shift Left o *desplazamiento de bits a la izquierda conservando el bit de signo*.
* ``shr(cantidadDeBits)``. De Signed Shift Right o *desplazamiento de bits a la derecha conservando el bit de signo*.
* ``ushr(cantidadDeBits)``. De Unsigned Shift Right o *desplazamiento de bits a la derecha (incluyendo y desplazando el bit de signo)*.
* ``and(numero)``. Efectúa el ``and`` de los bits.
* ``or(numero)``. Efectúa el ``or`` de los bits.
* ``xor(numero)``. Efectúa el ``xor`` de los bits.
* ``inv(numero)``. Efectúa la inversión lógica de bits.

Estas operaciones pueden usarse no solo como métodos sino también como *operadores*, tal y como ilustra el código siguiente:

.. code-block:: kotlin

    val a : Int = 43
    val b : Int = 0b0000_0001
    // Si a tiene activo el último bit
    // (usando método and)
    val resultado1 = a.and(b)
    if ( resultado1 == b) {
        println ("El último bit de $a está activo")
    }
    // Si a tiene activo el último bit
    // (usando notación infija)
    val resultado2 = a and b
    if ( resultado2 == b) {
        println ("El último bit de $a está activo")
    }
    

Tipo ``Char``
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Los ``Char`` **no pueden usarse como enteros**, aunque sí pueden usarse intervalos como muestra el programa siguiente:

.. code-block:: kotlin

    caracter : Char
    ...
    if (caracter in 'a'..'z')
    
Se pueden usar también los carácteres típicos como ``\n`` o ``\r``.

``Boolean``
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Funcionan como en Java, solo aceptan dos valores (``true`` y ``false``), que permiten hacer comprobaciones usando las operaciones típicas ``&&`` (``and`` lógico), ``||`` (``or`` lógico) y ``!`` (``not``).

Vectores
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

En Kotlin los vectores se crean usando la clase ``Array`` y además **una vez creados, son inmutables**. Para acceder a los valores almacenados se usan los corchetes ``[`` y ``]``, que en realidad enmascaran llamadas a método ``get`` y ``set``. La longitud de un vector se obtiene con la propiedad ``size``.

Para crear vectores se pueden usar varias posibilidades, entre ellas:

* La función ``arrayOf``, la cual recibe un número variable de argumentos y devuelve un vector.

* Funciones fábrica, que podemos crear utilizando funciones anónimas con un parámetro que indique el tamaño del vector y después código que cree los elementos del vector. Más adelante se estudiará el uso de las funciones por lo que si no se comprende muy bien este punto puede ignorarse por ahora y volver aquí después de leer el capítulo sobre funciones.

A continuación se muestran dos maneras de crear vectores

.. literalinclude: cap2_fundamentos/ejemplos/vectores.kt

Y el resultado de este programa es:

.. program-output:: java -jar cap2_fundamentos/ejemplos/ejemplo_vectores.jar 
   :shell:


Problemas propuestos
--------------------------------------------------------------------

Tamaños de los tipos
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

*Crear un programa que imprima los números más grandes y más pequeños que pueden almacenar los tipos básicos en Kotlin*

Por fortuna, Kotlin (al igual que Java) incluye constantes dentro de las clases que permiten consultar estos valores muy fácilmente.

.. literalinclude:: programas/programa_1_tam_tipos_basicos.kt
   :language: kotlin
   
Obtendremos el siguiente resultado
   
.. program-output:: java -jar cap2_fundamentos/programas/programa_1_tam_tipos_basicos.jar

