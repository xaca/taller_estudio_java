public class CustomException extends Exception{
    //Esta clase nos permitirá mostrar el mensaje personalizado
    public static final long serialVersionUID = 700L;
    
    public CustomException(String mensaje){
        
        super(mensaje);
    }
}
