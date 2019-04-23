public class propio {
	propio(){
	
	}

	public void ValidarPassword(String pass,String repass) throws CustomExeption{
		if(!pass.equals(repass)){
			throw new CustomExeption("los campos password no coinciden");
		}
		if(pass.length() < 8){
			throw new CustomExeption("El password no es lo suficientemente largo");
		}
	}
}