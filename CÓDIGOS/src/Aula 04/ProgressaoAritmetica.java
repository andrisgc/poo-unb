public class ProgressaoAritmetica {
    // Definição de atributos de uma PA
    int a0;
    int r;
    int n;
    int[] termos;

    //Implementação dos métodos de uma PA
    public ProgressaoAritmetica(int primTermo, int razao, int numero) {
        a0 = primTermo;
        r = razao;
        n = numero;
        termos = new int[n];
    }

    int[] calcularTermos () {
        for (int i=0; i<n; i++)
            termos[i] = a0 + i * r;
        return termos;
    }

    int somarTermos() {
        int soma = 0;
        for (int i=0; i<n; i++)
            soma += termos[i];
        return soma;
    }

    String imprimirPA() {
        String resposta = "";
        resposta += "[ ";
        for (int i = 0; i < n; i++)
            resposta += termos[i] + ", ";
        resposta += "] " + "\n";
        resposta += "Soma: " + somarTermos();
        return resposta;
    }
}