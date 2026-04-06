import java.util.Scanner;

public class Pratica1 {
    public static void main(String[] args) {
        String nome;
        int anoNascimento;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do cidadão:");
        nome = sc.nextLine();
        System.out.println("Informe o ano de nascimento:");
        anoNascimento = sc.nextInt();

        String resposta = "Olá " + nome + "\n";
        resposta += "Você tem " + (2026 - anoNascimento) + " anos de idade. \n";

        System.out.println(resposta);
    }
}