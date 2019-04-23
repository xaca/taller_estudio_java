
public class ExcepcionIntervalo extends Exception {
    public ExcepcionIntervalo(String msg) {
        super(msg);
    }

    // La función miembro que lanza una excepción tiene la declaración habitual que
    // cualquier otro método pero se le añade a continuación la palabra reservada
    // throws seguido de la excepción o excepciones que puede lanzar.
    static void rango(int num, int den) throws ExcepcionIntervalo {
        if ((num > 100) || (den < -5)) {
            // Cuando el numerador es mayor que 100 y el denominador es menor que 5 se lanza
            // throw una excepción, un objeto de la clase ExcepcionIntervalo. Dicho objeto
            // se crea llamando al constructor de dicha clase y pasándole un string que
            // contiene el mensaje "Números fuera del intervalo".
            throw new ExcepcionIntervalo("Números fuera del intervalo");
        }
    }

}
