# Interface 💻
 Santiago Quintero - 000321086 😎
__________________________________________________________________________________________________

## ¿Qué es?

Una interfaz en Java es una colección de métodos abstractos y propiedades constantes.
En las interfaces se especifica qué se debe hacer, pero no su implementación. Las interfaces son una forma de especificar qué debe hacer una clase sin especificar el cómo.
Serán las clases que implementen estas interfaces las que describan la lógica del comportamiento de los métodos.

## Diferencia entre interface y abstract:
La principal diferencia entre interface y abstract es que una interface proporciona un mecanismo 
de encapsulación de los protocolos de los métodos sin forzar al usuario a utilizar la herencia.

## Ventajas:
- Organizar la programación.
- Permiten declarar constantes que van a estar disponibles para todas las clases que queramos (implementando esa interfaz)
- Obligar a que ciertas clases utilicen los mismos métodos (nombres y parámetros).
- Establecer relaciones entre clases que no estén relacionadas.


![N|Solid](https://jarroba.com/wp-content/uploads/2014/04/Interface_java_jarroba.jpg)
Tomado de: https://jarroba.com/polimorfismo-en-java-interface-parte-ii-con-ejemplos/
--------------------------------------------------------------------------------------------------


# Ejercicio 💼

El ejercicio consiste en que hubo un error cuando el cliente hizo el chance, por lo que usted deberá modificar 
los datos del cliente.

Crear una clase Cliente con los atributos nombre, apellido, numeroChance.
Escribe una interfaz, llamada InterfazCliente, que declare los siguientes métodos:

imprimir(): este método imprimirá que cliente y con que número hizo el chance.
modificar(): modificará los atributos de algún cliente.
 