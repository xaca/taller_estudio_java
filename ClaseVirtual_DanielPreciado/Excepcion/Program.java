public class Program {

    public static void main(String[] args) throws ExcepcionDead {
        boolean isDead = true;
        if(isDead) throw new ExcepcionDead();
        else System.out.println("Monta tu dragón");
    }
}