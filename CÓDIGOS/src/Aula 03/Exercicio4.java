import java.util.Arrays;

public class Exercicio4 {
    public static void main (String[] args) {
        int[] fibonacci = new int[10];


        for (int i=0; i<10; i++) {
            if (i == 0 || i == 1)
                fibonacci[i] = 1;
            else
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println(Arrays.toString(fibonacci));
    }
}