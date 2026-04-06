import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main (String[] args) {
        String strA = JOptionPane.showInputDialog("Informe o valor de A:");
        String strB = JOptionPane.showInputDialog("Informe o valor de B:");

        float a = Float.parseFloat(strA);
        int b = Integer.parseInt(strB);

        JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b));
        JOptionPane.showMessageDialog(null, "A - B = " + (a - b));
        JOptionPane.showMessageDialog(null, "A / B = " + (a / b));
        JOptionPane.showMessageDialog(null, "A / B = " + ((int)a / b));
    }
}