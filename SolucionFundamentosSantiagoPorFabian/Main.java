import java.util.Scanner;

public class Main {
    public static void main(String [ ] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Obtener entradas
        // Obtener el número entero que indica la posición inicial
        System.out.println("Ingrese la posicion incial");
        int pInicial = leer.nextInt();

        // Obtener el número entero que indica la posición final
        System.out.println("Ingrese la posicion final");
        int pFinal = leer.nextInt();

        int camino1 = pFinal - pInicial;
        int camino2 = 360 + pInicial - pFinal;

        if (camino1<camino2){
            System.out.println("\nEl camino mas cercano es " + camino1);
        }else{
            System.out.println("\nEl camino mas cercano es " + camino2*-1);
        }

    }
}