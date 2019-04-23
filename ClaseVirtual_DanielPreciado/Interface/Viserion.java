class Viserion implements Dragon {
    private String tipoFuego;

    @Override
    public void comer() {
        System.out.println("\nComer?\nwhat do dragons eat anyway?\n -Whatever they want");
    }

    @Override
    public void lanzarFuego() {
        if(tipoFuego.equals("Azul"))
        {
            System.out.println("\nLanzar Fuego? \nViserion ahora hace parte de Los Otros");
        }
        else{
            System.out.println("\nLanzar Fuego? \nViserion sigue siendo estando vivo");
        }
    }
    public String getTipoFuego() {
        return tipoFuego;
    }
    public void setTipoFuego(String tipoFuego) {
        this.tipoFuego = tipoFuego;
    }
    
    
}