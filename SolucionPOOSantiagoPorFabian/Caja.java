public class Caja {

    private int alto;
    private int largo;
    private int ancho;
    
    // Caja ideal
    public Caja(){
        alto = 10;
        largo = 15;
        ancho = 20;
    }

    public Caja(int alto, int largo, int ancho){
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }

    public int CalcularArea(){
        return 2*ancho*largo + 2*largo*alto + 2*alto*ancho;
    }

    public int CalcularVolumen(){
        return ancho*largo*alto;
    }

    public boolean CompararConIdeal(){
        if( this.alto == 10 && this.largo == 15 && this.ancho == 20 ){
            return true;
        }
        return false;
    }

}