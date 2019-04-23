public class CustomExcep extends Exception{

    // Excepcion es la clase padre

    public static final long SerialVersionUID=  500L; // Este es un ID que JAVA requiere para manejar la excepcion en el Runtime

    public CustomExcep(String mensaje){
        super(mensaje);
    }
}