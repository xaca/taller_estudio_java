/*
Punto 3) Actividad  dia sin carro INTERFACE
 Isabel Zuluaga González - 000138379

Una interfaz (interface) es sintácticamente similar a una clase abstracta, 
 en la que puede especificar uno o más métodos que no tienen cuerpo ({}).
 Esos métodos deben ser implementados por una clase para que se definan sus acciones.

 Por lo tanto, una interfaz especifica qué se debe hacer, pero no cómo hacerlo. 
 Una vez que se define una interfaz, cualquier cantidad de clases puede implementarla. 
 Además, una clase puede implementar cualquier cantidad de interfaces.
 
 fuente:
https://javadesdecero.es/intermedio/interfaces-ejemplos/

 */

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class demoInterfaz {
    public static void main(String[] args) {

        Scanner miNumMin = new Scanner(System.in);
        Scanner miNumMax = new Scanner(System.in);

        System.out.println("Ingrese el limite Minimo: ");
        int min = miNumMin.nextInt();
        System.out.println("Ingrese el limite Maximo: ");
        int max = miNumMax.nextInt();

        grupoNum ob = new grupoNum(min,max);

        int suma = ob.sumarNumeros();
            System.out.println("La suma de los numeros es: \n"+suma);
            System.out.println("\nEl grupo de numeros es: ");
          ob.imprimirNumeros();
           System.out.println("\nEl grupo de numeros pares es: ");
         ob.imprimirNumerosPares();
         
        
    }
}

