public class Vuelos {
    
    

    private Aviones avion;
    private String lugarSalida;
    private String lugarDestino;
    private int fechaSalida;
    private int fechaLlegada;
    private Pasajeros pasajeros;
    
    public Vuelos (){

    }
    
    public Vuelos (Aviones avion, String lugarSalida,String lugarDestino, int fechaSalida, int fechaLlegada, Pasajeros pasajeros){
        
        this.avion = avion;
        this.lugarSalida = lugarSalida;
        this.lugarDestino = lugarDestino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.pasajeros = pasajeros;
    }
}
