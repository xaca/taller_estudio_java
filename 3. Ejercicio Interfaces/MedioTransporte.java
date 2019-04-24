public interface MedioTransporte {
    void Moverse(int distancia);

    void Frenar(int umbral);

    void Parquear();

    boolean Encender();

    boolean Apagar();
}
