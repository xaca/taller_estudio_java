Cristian David Gómez Román.


Ejercicio de lógica en java: Criptografía por transposición. :muscle: :boom:
===========================================================================


### Se debe crear un aplicativo que funcioné para procesar mensajes criptográficos. :confounded:


Si se recibe un mensaje este se cifrará bajo el método de transposición **(1)** y el usuario ingresa un valor además del mensaje el cual es la variable que 
dicta cuanto transponer el texto y luego retornar el mensaje cifrado. **(2)**
Si se recibe un mensaje inicial izado por $#/mensaje **(3)** debe descifrarlo y retornar el mensaje original.




### Notas: :books:


* **(1)** El cifrado por transposición es un método por el cual las letras del mensaje se cambian por una a n posiciones a la derecha de la original en el abecedario, ejemplo: hola mundo --> ipmb~nwlp (en este caso se hizo a 1 de distancia y el espacio se toma por ~).
En caso de llegar a z sin acabar de contar inicia de nuevo es decir: "z" a 1 es "a","z" a 2 es "b", "x" a 2 es "a".


* **(2)** El mensaje cifrado debe iniciar por "$#/" # es el numero que se uso para cifrar. Ejemplo hola mundo --> $1/ipmb~nwlp 


* **(3)** Para descifrar un mensaje se devuelve # veces a la izquierda y según el mensaje de estrada lo estipule.




Ejercicio de clases en java: El Hotel
=====================================


# Un empresario necesita un sistema para administrar hoteles que tiene a su disposición. :moneybag:


Por el momento tiene 3 hoteles: 
* Hotel playa: tiene 10 habitaciones, piscina, sauna y esta al borde del mar. 


* Hotel rural: es un hotel en el campo que tiene 5 habitaciones, sauna, siembra de café, taller para procesar café y barra libre de desayunos. 


* Hotel ciudad: tiene 20 habitaciones, piscina, sauna, gimnasio, tienda, restaurante. 


Se necesita que el sistema ingrese cuando un cliente arrienda una habitación, por cuanto tiempo y que habitaciones están ocupadas en cual hotel.