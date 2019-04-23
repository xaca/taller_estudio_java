/*  Solución ejercicio de las Cajas
    Isabel Zuluaga González - 000138379 */

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class ConocerCaja
{
    public static void main(String args[])
    {
        Scanner miAlto = new Scanner(System.in);
        Scanner miLargo = new Scanner(System.in);
        Scanner miAncho = new Scanner(System.in);

        System.out.println("Ingrese el Alto de su caja: ");
        double alto = miAlto.nextDouble();
        System.out.println("Ingrese el Largo de su caja: ");
        double largo = miLargo.nextDouble();
        System.out.println("Ingrese el Ancho de su caja: ");
        double ancho = miAncho.nextDouble();

        Caja miCaja = new Caja(alto,ancho,largo);

        double alturaMiCaja = miCaja.getAlto();
        double anchoMiCaja = miCaja.getAncho();
        double largoMiCaja = miCaja.getLargo();
        double areaMiCaja = miCaja.getArea();
        double volumenMiCaja = miCaja.getVolumen();
        double perimetroMiCaja = miCaja.getPerimetro();

        System.out.println(" El alto de su caja es: " + alturaMiCaja+"\n El ancho de su caja es: "+anchoMiCaja+"\n El largo de su caja es: "+ largoMiCaja);
        System.out.println(" El AREA de su caja es: " +areaMiCaja+"\n El VOLUMEN de su caja es: "+volumenMiCaja+"\n El PERIMETRO de su caja es: "+perimetroMiCaja);


    }

}