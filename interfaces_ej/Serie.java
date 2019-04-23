
public class Serie implements Entregable{
 

    private String titulo;
    private int numeroTemporadas;
    private boolean prestado;
    private String genero;
    private String creador;
    private int id;
 
    //Métodos publicos
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
   
    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }
 
 
    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
 
  
    public String getGenero() {
        return genero;
    }
 

    public void setGenero(String genero) {
        this.genero = genero;
    }
 
 
    public String getCreador() {
        return creador;
    }
 

    public void setcreador(String creador) {
        this.creador = creador;
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
        return "Informacion de la Serie: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de temporadas: "+numeroTemporadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCreador: "+creador+"\n" +
                "\tPrestado: "+prestado+"\n" +
                "\tID: "+id;
    }
 
   
    //Constructor
 
    /**
     * Constructor por defecto
     */
   
   

    public Serie(String titulo, int numeroTemporadas, String genero, String creador,int id){
        this.titulo=titulo;
        this.numeroTemporadas=numeroTemporadas;
        this.genero=genero;
        this.creador=creador;
        this.id=id;
        this.prestado=false;
    }
 
}

