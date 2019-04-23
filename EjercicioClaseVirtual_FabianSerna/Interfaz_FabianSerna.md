# Interface 🔑
##### Fabian Serna Salazar - 000318757
---

## ¿Qué es?
Una interfaz se puede ver como una forma o molde, que permite declarar nombres de métodos, listas de argumentos, tipos de datos de retorno y constantes, dichos métodos no son definidos en la interfaz, sino que se definen en la clase que utilice la interfaz

## Diferencias entre una interfaz y una clase abstracta
 - Todos los métodos de una interfaz se declaran implícitamente como abstractos y públicos.
 - Una clase abstracta no puede implementar los métodos declarados como abstractos, una interfaz no puede implementar ningún método (ya que todos son abstractos).
 - Una interfaz no declara variables de instancia.
 - Una clase puede implementar varias interfaces, pero sólo puede tener una clase ascendiente directa.
 - Una clase abstracta pertenece a una jerarquía de clases mientras que una interfaz no pertenece a una jerarquía de clases. En consecuencia, clases sin relación de herencia pueden implementar la misma interfaz.

## Ventaja de usar interfaz
La ventaja principal del uso de interfaces es que una clase interface puede ser implementada por cualquier número de clases, permitiendo a cada clase compartir el interfaz de programación sin tener que ser consciente de la implementación que hagan las otras clases que implementen la interface.

## Ejercicio
Muchos animales realizan las mismas acciones, pero de diferentes maneras, es decir, hay una cantidad de animales que corren, comen, beben, saltan, pero no lo hacen de la misma manera, algunas lograrán saltar hasta 2 metros, otros podrán comer hasta 2 kg de carne, y así respectivamente.
Teniendo en cuenta lo anterior, cree una interfaz Animal, con los siguiente métodos
 - Comer(alimento): Este método se utilizará para comer el alimento según el animal
 - Beber(liquido): Este método se utilizará para beber el liquido según el animal
 - Correr(distancia): Este método se utilizará para ver el tiempo en que se demora el animal para correr dicha distancia
 - Saltar(altura): Este método se utilizará para ver si el animal puede saltar dicha altura

Luego de crear la interfaz Animal, cree una clase Gato y otro Perro, implemente la interfaz en estas clases, y defina sus métodos
