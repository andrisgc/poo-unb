public class Medida {
    int valor;
    String unidade;

    public Medida(int valor, String unidade) {
        this.valor = valor;
        this.unidade = unidade;
    }

    String imprimir() {
        String resposta = "";
        resposta = valor + " " + unidade;
        return resposta;
    }

}