import java.util.Scanner;

public class Aleatorio{
    
    public static void main(String args[])

    {

      int n,m,r;
      n=5;
      m=20;
      r= (int)Math.floor(Math.random()*(n-m)+m);
      System.out.println("El numero fue generado entre "+n+" y "+m);
      int numero;
      int i=0;
      do{
      System.out.println("Escribe un numero");
      Scanner dato = new Scanner(System.in);
      numero = dato.nextInt();
      i++;
      }
      while(r != numero);
      System.out.println("Ganaste numero de intentos "+i);

      
    }


}