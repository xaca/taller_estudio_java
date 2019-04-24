# Ejercicio de Excepciones Persobalizadas 🏃 

Antes revise este enlace  🌀 : [a link](http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/excepciones/propias.htm)

### ¿Qué es?
El lenguaje Java proporciona las clases que manejan casi cualquier tipo de excepción. Sin embargo, podemos imaginar situaciones en la que producen excepciones que no están dentro del lenguaje Java. Siguiendo el ejemplo de la página anterior estudiaremos una situación en la que el usuario introduce un valor fuera de un determinado intervalo, el programa lanza un excepción, que vamos a llamar ExcepcionIntervalo.

### El ciclo de vida de una excepción se puede resumir del siguiente modo:

Se coloca la llamada a la función susceptible de producir una excepción en un bloque try...catch
En dicha función se crea mediante new un objeto de la clase Exception o derivada de ésta
Se lanza mediante throw el objeto recién creado
Se captura en el correspondiente bloque catch
En este bloque se notifica al usuario esta eventualidad imprimiendo el mensaje asociado a dicha excepción, o realizando una tarea específica.
 