
/* Punto 4) Actividad  dia sin carro Excepciones propias
    Isabel Zuluaga González - 000138379

    Para no limitar al desarrollador java permite crear excepciones personalizadas que se ajusten
    ala necesidad del programa
*/

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class demoExcepcion {
    public static void main(String[] args) {


         Scanner miNumerador = new Scanner(System.in);
        Scanner miDenominador = new Scanner(System.in);

        System.out.println("Ingrese el numerador: ");
        String str1 = miNumerador.next();
        System.out.println("Ingrese el denominador: ");
        String str2 = miDenominador.next();

        // String str1="120";
	    // String str2="3";
        String respuesta;
	    int numerador, denominador, cociente;
        try{
            numerador=Integer.parseInt(str1);
            denominador=Integer.parseInt(str2);
            rango(numerador, denominador);
            cociente=numerador/denominador;
            respuesta=String.valueOf(cociente);
        }catch(NumberFormatException ex){
            respuesta="Se han introducido caracteres no numéricos";
        }catch(ArithmeticException ex){
            respuesta="División entre cero";
        }catch(ExcepcionPropia ex){
            respuesta=ex.getMessage();
        }
        System.out.println(respuesta);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
     static void rango(int num, int den)throws ExcepcionPropia{
        if((num>100)||(den<-5)){
            throw new ExcepcionPropia("Números fuera del intervalo");
        }
    }

}

 