# Ejercicio propuesto de interfaces:


#### Crearemos una clase llamada Serie con las siguientes características:

- Sus atributos son titulo, numero de temporadas, prestado, genero y creador.

- Por defecto, el numero de temporadas es de 3 temporadas y prestado false. El resto de atributos serán valores por defecto según el tipo del atributo.

- Los constructores que se implementaran serán:

	    Un constructor por defecto.


- Los métodos que se implementara serán:

	    Métodos get de todos los atributos, excepto de prestado.
	    Métodos set de todos los atributos, excepto de prestado.



#### Crearemos una clase Videojuego con las siguientes características:

- Sus atributos son titulo, horas estimadas, prestado, genero y compañia.

- Por defecto, las horas estimadas serán de 10 horas y prestado false. El resto de atributos serán valores por defecto según el tipo del atributo.

- Los constructores que se implementaran serán:

	    Un constructor por defecto.


- Los métodos que se implementara serán:

	    Métodos get de todos los atributos, excepto de prestado.
    	Métodos set de todos los atributos, excepto de prestado.


##### Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:

    entregar(): cambia el atributo prestado a true.
    devolver(): cambia el atributo prestado a false.

#### Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:

- Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
- Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
- Entrega algunos Videojuegos y Series con el método entregar().
