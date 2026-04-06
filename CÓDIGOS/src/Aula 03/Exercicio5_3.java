import java.util.Scanner;

public class Exercicio5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] vet = new int[x];

        vet[0] = scanner.nextInt();
        int min = vet[0];
        int max = vet[0];
        for (int i=1; i<x; i++) {
            vet[i] = scanner.nextInt();
            if (vet[i] < min) min = vet[i];
            if (vet[i] > max) max = vet[i];
        }

        scanner.close();

        int[] qnt = new int[max+1];
        int max_cont = 0;
        for (int i=min; i<=max; i++) {
            int contador = 0;
            for (int j=0; j<x; j++) {
                if (vet[j] == i)
                    contador++;
            }
            qnt[i] = contador;

            if (contador > max_cont) max_cont = contador;
        }

        int aux = max_cont;
        for (int i=0; i<aux; i++) {
            for (int j=min; j<=max; j++) {
                if (qnt[j] >= max_cont) {
                    System.out.print("* ");
                } else if (qnt[j] > 0)
                    System.out.print("  ");
            }
            System.out.println();
            max_cont--;
        }

        for (int i=min; i<=max; i++) {
            if (qnt[i] != 0)
                System.out.print(i + " ");
        }
        System.out.println();

    }
}