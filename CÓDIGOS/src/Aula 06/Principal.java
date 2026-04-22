public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10, "mm");
        Cilindro cilindro = new Cilindro(circulo, new Medida(100, "mm"));

        circulo.calcularArea();
        System.out.println(circulo.area.getValor());
        circulo.calcularPerimetro();
        System.out.println(circulo.perimetro.getValor());

        cilindro.calcularAreaSuperficie();
        System.out.println(cilindro.areaSuperficie.getValor());
        cilindro.calcularVolume();
        System.out.println(cilindro.volume.getValor());
    }
}