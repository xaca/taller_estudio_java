# talller_estudio_java
Ejercicios organizados por categorías, desde variables hasta interfaces y clases abstractas.

# Ejercicios propuestos por Maicol Llano Moncada. :fire: :boom:

## Fundamentos de programación

1. Crear un programa que genere un número aleatorio entre n y m y lo almacene (n y m son variables asignadas por el programador):

    - Imprimir por pantalla un mensaje que indique el rango en el que fue generado el número aleatorio (n-m)
    - Pedir al usuario que ingrese números hasta que el valor ingresado sea igual al número generado aleatoriamente.
    - Contabilizar la cantidad de intentos hasta acertar.

    *Una vez se tenga un acierto, indicarle al usario y mostrar en pantalla el número de intentos realizados.

## OOP

2. El gimnasio de la Universidad Pontificia Bolivariana necesita calcular el costo de inscripción mensual para sus clientes, según el tipo de plan especificado en la tabla y otros criterios adicionales. 

    | Plan | Costo     |
    |------|-----------|
    | 1    | $ 75.000  |
    | 2    | $ 415.000 |
    | 3    | $ 812.000 |


- Tener en cuenta que cada uno de los planes tiene la posibilidad de tener instructor privado, lo que incrementaría el costo mensual en un 40%. 
- Las personas mayores de 60 años tienen un descuento sobre el precio final del 20% y los menores de 25 años, un descuento del 15%. 
- Además los que presenten carné de estudiante, recibirán un descuento adicional del 5%.
    
Diseñar el correspondiente programa en Java que le pregunte al usuario qué tipo de plan quiere, si desea tener instructor personal, su edad, si es estudiante de UPB y con estos datos calcule e imprima la siguiente información:

- Costo base del plan seleccionado
- Costos adicionales (instructor)
- Costo total sin descuentos
- Descuentos obtenidos y motivo del descuento
- Valor total con descuentos