import java.util.Scanner;
import javax.swing.JOptionPane;

public class NumerosAleatorios_Maicol {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n = 5;
        int m = 1;
        int nAleatorio = (int) (Math.random()*(n-m)+m);
        
        System.out.println("El numero aleatorio esta entre: " + m +" - " + n);
        int usuario;
        int contador = 1;
        System.out.println("Ingrese el numero que crees que es");
        
        do {
            
            usuario = entrada.nextInt();
            
            if (usuario != nAleatorio){
                
                System.out.println("Sigue intentado");
                contador = contador + 1;
                
            }
            
        }while (usuario != nAleatorio);
        
        System.out.println("Correcto" + "." + "\nLo intentaste " + contador + " veces.");
    }
    
}
