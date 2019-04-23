/*  Solución ejercicio Criaturas Fantásticas
    Isabel Zuluaga González - 000138379 */
import java.util.Scanner;

public class CriaturasFantasticas {

    public static void main(String args[]){

        Scanner miCfCabeza = new Scanner(System.in);
        Scanner miCfLugarVive = new Scanner(System.in);
        Scanner miCfTipCuerpo = new Scanner(System.in);
        Scanner miCfMarca = new Scanner(System.in);
        Scanner miCfProfesion = new Scanner(System.in);

        System.out.println("Ingrese la cabeza de su criatura: ");
        String cabeza = miCfCabeza.next();
        System.out.println("Ingrese el lugar donde vive su criatura: ");
        String lugarVive = miCfLugarVive.next();
        System.out.println("Ingrese el tipo de cuerpo de su criatura: ");
        String tipoCuerpo = miCfTipCuerpo.next();
        System.out.println("Ingrese la marca de su criatura: ");
        String marca = miCfMarca.next();
        System.out.println("Ingrese la profesión de su criatura: ");
        String profesion = miCfProfesion.next();


        String letra1 = cabeza.substring(0,1);
        String letra2 = lugarVive.substring(0,1);
        String letra3 = tipoCuerpo.substring(0,1);
        String letra4 = marca.substring(0,1);
        String letra5 = profesion.substring(0,1);

        System.out.println("Nombre de la Criatura: "+ letra1+letra2+letra3+letra4+letra5);

    }


}