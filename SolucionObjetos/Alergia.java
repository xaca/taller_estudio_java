public class Alergia {
    private int nivelCongestion;
    private int picazonNariz;
    private int molestiasEpidermicas;

    /**
     * @return the nivelCongestion
     */
    public int getNivelCongestion() {
        return nivelCongestion;
    }

    /**
     * @param nivelCongestion the nivelCongestion to set
     */
    public void setNivelCongestion(int nivelCongestion) {
        this.nivelCongestion = nivelCongestion;
    }

    /**
     * @return the picazonNariz
     */
    public int getPicazonNariz() {
        return picazonNariz;
    }

    /**
     * @param picazonOjos the picazonOjos to set
     */
    public void setPicazonNariz(int picazonNariz) {
        this.picazonNariz = picazonNariz;
    }

    /**
     * @return the molestiasEpidermicas
     */
    public int getMolestiasEpidermicas() {
        return molestiasEpidermicas;
    }

    /**
     * @param molestiasEpidermicas the molestiasEpidermicas to set
     */
    public void setMolestiasEpidermicas(int molestiasEpidermicas) {
        this.molestiasEpidermicas = molestiasEpidermicas;
    }
    public Alergia()
    {

    }
    public Alergia(int picazonNariz, int nivelCongestion, int molestiasEpidermicas)
    {
        this.nivelCongestion=nivelCongestion;
        this.picazonNariz=picazonNariz;
        this.molestiasEpidermicas=molestiasEpidermicas;
    }
}
