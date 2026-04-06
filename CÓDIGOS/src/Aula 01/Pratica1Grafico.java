import javax.swing.JOptionPane;

public class Pratica1Grafico {
    public static void main (String[] args) {

        String nome,
               strAnoNascimento;
        int anoNascimento;

        nome = JOptionPane.showInputDialog("Informe o nome do cidadão:");
        strAnoNascimento = JOptionPane.showInputDialog("Informe o ano de nascimento:");
        anoNascimento = Integer.parseInt(strAnoNascimento);

        String resposta = "Olá " + nome + "\n";
        resposta += "Você tem " + (2026 - anoNascimento) + " anos de idade.\n";

        JOptionPane.showMessageDialog(null, resposta);

    }
}