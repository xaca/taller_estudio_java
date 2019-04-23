public class Principal {
	public static void main(String[] args){

		String usuario,clave,reclave;
		usuario = "sebascz";
		clave = "12345777";
		reclave = "45321777";

		Propio h= new propio();

		try{
			h.validarClave(clave,reclave);

		}

		catch(Exepcion e){
			System.out.println("no se puede registrar debido a: "+e.getMessage());

		}
	}
}