public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10, "mm");
        Cilindro cilindro = new Cilindro(circulo, new Medida(100, "mm"));

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.area.getValor());
        System.out.println(circulo.calcularPerimetro());
        System.out.println(circulo.perimetro.getValor());

        System.out.println(cilindro.calcularAreaSuperficie());
        System.out.println(cilindro.areaSuperficie.getValor());
        System.out.println(cilindro.calcularVolume());
        System.out.println(cilindro.volume.getValor());
    }
}