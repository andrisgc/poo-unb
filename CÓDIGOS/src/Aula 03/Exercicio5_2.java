import java.util.Scanner;

public class Exercicio5_2 {
    public static void main(String[] main) {
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

        int contador;
        for (int i=min; i<=max; i++) {
            int contagem = 0;

            for (int j=0; j<x; j++)
                if (vet[j] == i) contagem++;

            if (contagem != 0) {
                System.out.print(i + " ");
                for (int j = 0; j < contagem; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}