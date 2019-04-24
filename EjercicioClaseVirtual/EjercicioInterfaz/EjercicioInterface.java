import java.util.Scanner;

public class EjercicioInterface {

    public static void main(String[] args) {
        
        
        Cliente cliente = new Cliente();
        Scanner entrada = new Scanner(System.in);
        
        cliente.Imprimir();
        
        System.out.println("Pero hubo un error, ingrese los datos verdaderos.");
        
        System.out.println("\nIngrese el nombre");
        String nombre = entrada.next();
        
        System.out.println("Ingrese el apellido");
        String apellido = entrada.next();
        
        System.out.println("Ingrese el numero de chance");
        int numeroChance = entrada.nextInt();
        
        cliente.Modificar(nombre, apellido, numeroChance);
        
         cliente.Imprimir();
        
    }
    
}
