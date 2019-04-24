import java.util.Scanner;
public class Clave {
	public static void main(String[] args) throws ExcepcionClave{

		String clave,reclave;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su clave");
		clave = sc.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Verifique su clave");
		reclave = sc2.nextLine();
        try{
		if(clave.equals(reclave)){

		}else{
			throw new ExcepcionClave("la los campos clave no coinciden");

		}
	 }catch(Exception e){
		System.out.println(e.getMessage());

	 } 

		
	}
}