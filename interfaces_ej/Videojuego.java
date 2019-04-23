public class Videojuego implements Entregable{
 

    private String titulo;
    private int horas;
    private boolean prestado;
    private String genero;
    private String compañia;
    private int id;
 
    //Métodos publicos
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
   
    public int gethoras() {
        return horas;
    }
 
 
    public void sethoras(int horas) {
        this.horas = horas;
    }
 
  
    public String getGenero() {
        return genero;
    }
 

    public void setGenero(String genero) {
        this.genero = genero;
    }
 
 
    public String getcompañia() {
        return compañia;
    }
 

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }
 
   
    public void prestar() {
        prestado=true;
    }

    public void devolver() {
        prestado=false;
    }

    public boolean isPrestado() {
        if(prestado){
            return true;
        }
        return false;
    }
 
   
    
    public String toString(){
        return "Informacion del Videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de horas: "+horas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compañia+"\n" +
                "\tPrestado: "+prestado+"\n" +
                "\tID: "+id;
    }
 
   
    //Constructor
 
    /**
     * Constructor por defecto
     */
   
   

    public Videojuego(String titulo, int horas, String genero, String compañia, int id){
        this.titulo=titulo;
        this.horas=horas;
        this.genero=genero;
        this.compañia=compañia;
        this.prestado=false;
        this.id=id;
    }
 
}

