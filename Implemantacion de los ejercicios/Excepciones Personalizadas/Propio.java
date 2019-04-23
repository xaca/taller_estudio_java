public class propio {
	propio(){
	
	}

	public void Validar(String pass,String repass) throws Exepcion{
		if(!clave.equals(reclave)){
			throw new CustomExeption("Los campos clave no coinciden");
		}
		if(clave.length() < 8){
			throw new Exepcion("La clave no es lo suficientemente largo");
		}
	}
}