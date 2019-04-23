import java.util.Scanner;

public class ExcepcionPersonalizada
{
	/*Programa que valida si la cadena que se ingreso es un correo valido
	 de la compañia cuyos correos son de la forma @case.com, 
	 es decir minimo debe tener 10 caracteres*/
	public static void main (String args[])
	{
		String correo;
		Scanner scanner= new Scanner(System.in);
		System.out.println("ingrese su correo por favor");
		correo=scanner.nextLine();
		try
		{
			// se comprueba si el correo que se ingreso tiene menos de 10 caracteres
			if(correo.length()<=9)
			{

				throw new MyException("la longitud del correo debe ser minimo de 10 caracteres");
				
			}
			// se valida que el correo posea la extension de la empresa de este ejemplo
			else if(correo.contains("@case.com")==false)
				{
					
					throw new MyException("Correo no valido, no contiene la extencion @case.com");

				}

				else
					{
						System.out.println("correo valido");	
					}
		
		}
		catch(Exception e)
		{
			System.out.println("el error es"+e);
		}
		

		
	}
}
