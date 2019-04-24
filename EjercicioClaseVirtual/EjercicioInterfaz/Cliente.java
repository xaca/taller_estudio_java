public class Cliente implements InterfazCliente{

    private String nombre;
    private String apellido;
    private int numeroChance;
    
    
    public Cliente(){
        
        this.nombre = "Cristian";
        this.apellido = "Quintero";
        this.numeroChance = 1234;
    }
    
    @Override
    public void Modificar(String nombre, String apellido, int telefono) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroChance = telefono;
    } 

    @Override
    public void Imprimir() {
        
        System.out.println("El cliente " + this.nombre + " " + this.apellido + " hizo el chance con el siguiente numero " + this.numeroChance +".");
    }
    
}
