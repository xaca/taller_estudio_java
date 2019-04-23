# Ejercicio de Interfaces 🏃 

Antes revise este enlace  🌀 : [a link](http://puntocomnoesunlenguaje.blogspot.com/2013/09/java-interfaces.html)

### ¿Qué es?
Una interfaz en Java es una colección de métodos abstractos y propiedades constantes.
En las interfaces se especifica qué se debe hacer, pero no su implementación. Las interfaces son una forma de especificar qué debe hacer una clase sin especificar el cómo.
Serán las clases que implementen estas interfaces las que describan la lógica del comportamiento de los métodos.

### Diferencia entre interface y abstract:
La principal diferencia entre interface y abstract es que una interface proporciona un mecanismo 
de encapsulación de los protocolos de los métodos sin forzar al usuario a utilizar la herencia.

### Ventajas:
- Organizar la programación.
- Permiten declarar constantes que van a estar disponibles para todas las clases que queramos (implementando esa interfaz)
- Obligar a que ciertas clases utilicen los mismos métodos (nombres y parámetros).
- Establecer relaciones entre clases que no estén relacionadas.

###Importante :
- Cuando tenemos clases que deben implementar un comportamiento idéntico, el método que implementa en el comportamiento se puede llevar a una clase abstracta.
- Si una clase va a tener un mismo método pero con distintas implementaciones, estos métodos se pueden definir en una interfaz.
En una interfaz todos los métodos son públicos y no se define nunca la implementación de los métodos.

###Ejericio propuesto :

Definir una interfaz Medio de transporte con los siguientes metodos :
- Moverse();
- Frenar();
- Parquear();
- Encender();
- Apagar();

Finalmente crear las clases Bus y Taxi que implementen la interfaz y hagan uso de su metodo constructor.