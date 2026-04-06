import javax.swing.JOptionPane;
import java.util.Scanner;

public class Versao1 {
    public static void main(String[] args) {
        boolean sair = false;
        do {
            sair = apresentarMenuOpcoes();
        } while (!sair);
    }

    private static boolean apresentarMenuOpcoes () {
        boolean sair = false;
        String menuOpcoes = "Informe o tipo de figura geométrica: \n"
            + 1 ""
            + 2 ""
            + 3 ""
            + 4 ""
            + 5 ""
            + 6 ""
            + 7 ""
            + 8 ""
            + 9 ""

        String opStrEscolha = JOptionPane

        switch (opStrEscolha) {
            case "1": {
                calcularQuadrado();
                break;
            }
        }
    }
}