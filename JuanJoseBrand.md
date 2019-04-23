
# 1 problema POO  

colegio cuenta con los siguientes empleados: :school: :school_satchel:

- Docente de tiempo completo 

- Docente ocasional  

- Administrativos OPS 

- Administrativos de planta auxiliar 

- Administrativos de planta profesional 

Utilizando herencia implementar las respectivas clases en java, cada clase debe como tener atributos un nombre, id, apellido, fecha de nacimiento, teléfono y un salario. Además, los docentes tienen un área de estudio, agregar atributos que se consideren faltantes.  

# 2 fundamentos de programación: 
Crear una clase **NODO** que contenga los siguientes atributos:  Nombre, apellido y año de nacimiento, además crear un programa que permita agregar istancias de NODO a una lista o array, sin importar el orden en el cual se agregan, aquellos NODOS con año de nacimiento igual deben quedar consecutivos, como ejemplo suponiendo que agregas A C B D en este orden, deben quedar organizados de esta forma:
- A nacido en el 2000
- B nacido en el 2000
- D nacido en el 2000
- C nacido en el 2001

 <mark>  NOTA:                                                
  tratar de crear un algoritmo lo más eficiente posible  </mark> 
&nbsp;
#  3 Exepciones 
&nbsp;
 ```java
 public class HolaMundo{
	static class DivisionEx extends Exception{
		private String mensageError;
		public DivisionEx(){
			super();
			this.mensageError = "divisor igual a cero";
		}
		public String getMensajeError(){
			return mensageError;
		}
	}
	public static void main(String args[]) throws DivisionEx {
		int dividendo = 8;
		int divisor = 0;
		try{
			if ( divisor == 0) {
				throw new DivisionEx();
			}
		}catch(DivisionEx e){
			System.out.println(e.getMensajeError());
        }
	}
}
```
# 4 Interfaz
Una interfaz en java es un conjunto de metodos abstractos los cuales funcionan como un cuerpo, la clase que implementa esta interfaz es la encargada de definir el funcionamiento de estos metodos, la implementacion de una interfaz guarda una gran relación con con la herencia, pero tambien una gran diferncia la cual es una clase solo puede heredar una vez, encambio puede implementar varias interfaz's, además una herencia puede tener atributos y metodos que si realizan algo. 
