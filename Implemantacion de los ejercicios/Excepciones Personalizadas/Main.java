public class Main {
	public static void main(String[] args){

		String user,pass,repass;
		user = "sebascz";
		pass = "12345777";
		repass = "45321777";

		Propio h= new propio();

		try{
			h.validarPassword(pass,repass0);

		}

		catch(CustomExeption e){
			System.out.println("no se puede registrar debido a: "+e.getMessage());

		}
	}
}