#Ejercicios JAVA
Daniel Preciado Tamayo

##Fundamentos :green_apple:
Un nutricionista que atiende pacientes tanto tanto de Colombia como de Estados Unidos desea optimizar el tiempo de las consultas, por eso requiere un programa que dados la altura y peso del paciente obtenga su índice de masa corporal (IMC) y la clasificación en que se encuentra según la siguiente tabla:

**Sistema Internacional**
| Clasificación 	|  IMC(kg/m²)  	|
|:-------------:	|:------------:	|
|   Bajo peso   	|    <18,50    	|
|     Normal    	| 18,5 - 24,99 	|
|   Sobrepeso   	|    ≥25,00    	|
|    Obesidad   	|    ≥30,00    	|

    IMC = Peso(kg) / [Altura(m)]^2 = Peso(lb) / [Altura(in)]^2 *703

:white_flag: Se debe tener en cuenta que para pacientes de Estados Unidos el peso está expresado en lb y la altura en pulgadas, para colombianos el peso en kg y la altura en metros. 

###Entradas :keyboard:
Sistema de Medidas (Sistema Internacional/Sistema Imperial)
Peso
Altura

###Salidas :checkered_flag:
IMC
Clasificación
Peso transformada al sistema de medida opuesto al que ingresó los datos
Altura transformada al sistema de medida opuesto al que ingresó los datos

##Programación Orientada a Objetose