public class Principal {
    public static void main() {
        ProgressaoAritmetica p1, p2, p3;

        p1 = new ProgressaoAritmetica(1, 2, 10);
        p2 = new ProgressaoAritmetica(2,5, 10);
        p3 = new ProgressaoAritmetica(0, 3, 7);

        p1.calcularTermos();
        p2.calcularTermos();
        p3.calcularTermos();

        System.out.println("P1" + p1.imprimirPA());
        System.out.println("-----------------------");
        System.out.println("P2" + p2.imprimirPA());
        System.out.println("-----------------------");
        System.out.println("P3" + p3.imprimirPA());
        System.out.println("-----------------------");
    }
}