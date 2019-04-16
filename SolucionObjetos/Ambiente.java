public class Ambiente
{
    private int nivelContaminacion;
    private int temperatura;
    private int kilometraje;
    private int estadoClima;
	/**
	 * @return the nivelContaminacion
	 */
	public int getNivelContaminacion() {
		return nivelContaminacion;
	}
	/**
	 * @param nivelContaminacion the nivelContaminacion to set
	 */
	public void setNivelContaminacion(int nivelContaminacion) {
		this.nivelContaminacion = nivelContaminacion;
	}
	/**
	 * @return the temperatura
	 */
	public int getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return kilometraje;
	}
	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	/**
	 * @return the estadoClima
	 */
	public int getEstadoClima() {
		return estadoClima;
	}
	/**
	 * @param estadoClima the estadoClima to set
	 */
	public void setEstadoClima(int estadoClima) {
		this.estadoClima = estadoClima;
    }
    public Ambiente()
    {

    }
    public Ambiente(int nivelContaminacion, int temperatura, int kilometraje, int estadoClima)
    {
        this.nivelContaminacion=nivelContaminacion;
        this.temperatura=temperatura;
        this.kilometraje=kilometraje;
        this.estadoClima=estadoClima;
    }
}
