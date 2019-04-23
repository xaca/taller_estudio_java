import javax.swing.JOptionPane;

public class PocketKnife {

    private String stealType;
    private int width;
    private int heigh;

    public PocketKnife(String stealType, int width, int heigh) {
        this.stealType = stealType;
        this.width = width;
        this.heigh = heigh;

    }

    public void cortar() {

        JOptionPane.showMessageDialog(null, "alert", "Corto", JOptionPane.ERROR_MESSAGE);

    }

}