
class Estudiante implements Persona {
    private int id;
    @Override
    public void caminar() {

    }

    @Override
    public double getIMC(double estatura, double peso) {
        double imc=0;
        imc=peso/(Math.pow((estatura/100),2));
        return imc;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}