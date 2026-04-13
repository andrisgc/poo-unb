public class Circulo {

    // Atributos de um circulo
    Medida raio,
           perimetro,
           area;

    // Construtores alternativos de um circulo
    public Circulo(float valor, String unidade) {
        raio = new Medida(valor, unidade);
    }

    public Circulo(Medida raio) {
        this.raio = raio;
    }

    // Métodos de um circulo
     public Medida calcularPerimetro() {
//      float valorRaio = raio.getValor();
//      String unidadeRaio = raio.getUnidade();
//      float valorPerimetro = 2 * 3.14f * valorRaio;

//      perimetro = new Medida(valorPerimetro, unidadeRaio);

        float valorPerimetro = 2 * raio.getValor() * 3.14f;
        perimetro = new Medida(valorPerimetro, raio.getUnidade());
        return perimetro;
     }

    public Medida calcularArea() {
        float valorArea = 3.14f * (float)Math.pow(raio.getValor(), 2);
        String unidadeArea = raio.getUnidade() + "2";
        area = new Medida (valorArea, unidadeArea);
        return area;
    }
}