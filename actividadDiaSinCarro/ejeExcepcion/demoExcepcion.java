
/* Punto 4) Actividad  dia sin carro Excepciones propias
    Isabel Zuluaga González - 000138379

*/

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class demoExcepcion {
    public static void main(String[] args) {


        Scanner miNumero = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        String str1 = miNumero.next();
        

        
        String respuesta;
	    int numero;
        try{
            numero=Integer.parseInt(str1);
            
            miLimite(numero);
       
            respuesta=String.valueOf(numero);
           
        }catch(NumberFormatException ex){
            respuesta="Solo se pueden introducir numeros";
        
        }catch(ExcepcionPropia ex){
            respuesta=ex.getMessage();
        }
         System.out.println("El numero introducido es: "+ respuesta);
       

        try  {
 
            System.in.read();
        }catch (Exception e) {  }
    }
     static void miLimite(int elNumero)throws ExcepcionPropia{
        if(elNumero>100){
            throw new ExcepcionPropia("Numero paso el limite");
        }
    }

}

 