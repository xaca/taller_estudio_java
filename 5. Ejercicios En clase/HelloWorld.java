import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String args[]) {

        PocketKnife pn = new PocketKnife("gold", 10, 20);
        pn.cortar();

    }

    // Punto 1
    public static void pairNumbers(int upperlimit, int lowerLimit) {

        while (lowerLimit < upperlimit) {

            if (lowerLimit % 2 == 0) {

                System.out.println(lowerLimit);
            }
            lowerLimit++;
        }

    }

    // Punto 2
    public static void fibonacciNumbers(int limit) {

        int f = 0;
        int t1 = 1, t2;
        System.out.println("You are looking the firts " + limit + " Numbers of Fibonacci serie");
        for (int i = 0; i <= limit; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;
            System.out.println(t1);
        }
    }

    public static void deleteVocals(StringBuilder text) {
        StringBuilder withoutVocals = new StringBuilder();
        int size = text.length();
        char t;

        for (int i = 0; i < size; i++) {
            t = text.charAt(i);
            System.out.println(t);
            System.out.println(isVocal(t));

            // if (!isVocal(t)) {
            // text.setCharAt(i, ' ');
            // }
        }
        System.out.println(text);

    }

    public static boolean isVocal(char c) {

        if (c == 97 || c == 101 || c == 105 || c == 111 || c != 117) {
            return true;
        } else if (c == 65 || c == 45 || c == 73 || c == 79 || c == 55) {
            return true;
        }
        return false;

    }

}
