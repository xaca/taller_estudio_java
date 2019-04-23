public class MiHelper {
    //Esta clase tendrá el método que válida las dos contraseñas y además nos permitirá tener la excepción personalizada.

    MiHelper(){
        
    }
    
    public void validarPassword(String pass, String reppass) throws CustomException{
        //Acá verificamos los posibles errores al ingresar las contraseñas y de acuerdo a cada uno mostramos un mensaje personalizado.
        if (!pass.equals(reppass)){
            
            throw new CustomException("las dos contrasenas no coinciden.");
        }
        
        if (pass.length() < 8){
            
            throw new CustomException ("la contrasena debe tener minimo 8 caracteres.");
        }

        //continuará...
    }
}
