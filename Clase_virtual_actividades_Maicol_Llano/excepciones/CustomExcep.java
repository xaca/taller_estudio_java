package Clase_virtual_actividades_Maicol_Llano.excepciones;

public class CustomExcep extends Exception{

    // Exception es la clase padre

    private static final long serialVersionUID = 6305997586524147457L;

    public CustomExcep(String message) {
        super(message);
    }
}