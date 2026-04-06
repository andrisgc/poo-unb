import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número na base decimal:");
        int decimal = scanner.nextInt();
        scanner.close();

        if (decimal == 0) {
            System.out.println("0");
            return;
        }

//      String binarioInvertido = "";
        StringBuilder binarioInvertido = new StringBuilder();

        while (decimal != 0) {
            int digito = decimal % 2;
            decimal = decimal / 2;
            binarioInvertido.append(digito);
        }

        String binario = binarioInvertido.reverse().toString();

//      String binario = "";
//      for (int i = binarioInvertido.length() - 1; i >= 0; i--) {
//          binario += binarioInvertido.charAt(i);
//      }

        System.out.println(binario);

    }
}