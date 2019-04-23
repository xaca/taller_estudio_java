public class ExcepcionMayoriaEdad extends Exception {
    
    public ExcepcionMayoriaEdad(int edad) {
        System.out.println(edad+" No es una edad válida, debes ser mayor a 18");
    }
}