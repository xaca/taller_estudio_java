// Al programa estudiado en la página anterior, añadimos la llamada a la función rango que verifica si los números están dentro del intervalo dado, y el bloque catch que captura la excepción que puede lanzar dicha función si los números no están en el intervalo especificado.

public class UsoEP {
    public static void main(String[] args) {
        String str1 = "120";
        String str2 = "3";
        String respuesta;
        int numerador, denominador, cociente;
        try {
            numerador = Integer.parseInt(str1);
            denominador = Integer.parseInt(str2);
            rango(numerador, denominador);
            // Aca es posible que se produzca una excepción
            cociente = numerador / denominador;
            respuesta = String.valueOf(cociente);
            // Capturamos las excepciónones
        } catch (NumberFormatException ex) {
            respuesta = "Se han introducido caracteres no numéricos";
        } catch (ArithmeticException ex) {
            respuesta = "División entre cero";
        } catch (ExcepcionIntervalo ex) {
            respuesta = ex.getMessage();
        }
        System.out.println(respuesta);
    }
}