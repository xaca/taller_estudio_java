public class Verifier {

    Verifier(){

    }

    public boolean validar(String pass, 
    String passrepeat) throws CustomExcep {
        if(!pass.equals(passrepeat)){
            throw new CustomExcep("Los campos de contraseña no son iguales");
        }

        if(pass.length() <= 8){
            throw new CustomExcep("La contraseña es demasiado corta, ingrese una mayor a 8 caracteres");
        }

        return true;
    }
}