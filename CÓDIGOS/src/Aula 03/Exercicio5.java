import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] vet = new int[x];

        for (int i=0; i<x; i++) {
            vet[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i=0; i<x-1; i++) {
            int min = i;
            for (int j=i; j<x; j++) {
                if (vet[j] < vet[min])
                    min = j;
            }
            int aux = vet[i];
            vet[i] = vet[min];
            vet[min] = aux;
        }

        int anterior = vet[0];
        System.out.print(vet[0] + " ");
        for (int i=0; i<x; i++) {
            if (vet[i] != anterior) {
                System.out.println();
                System.out.print(vet[i] + " ");
            }
            System.out.print("*");
            anterior = vet[i];
        }
        System.out.println();
    }
}