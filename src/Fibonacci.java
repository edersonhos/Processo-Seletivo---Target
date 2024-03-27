package src;

public class Fibonacci {
    private static String naoPertence = "O numero não pertence a sequencia de fibonacci";
    private static String simPertence = "O numero pertence a sequencia de fibonacci";

    public String pertence (int valor) {
        if (valor == 1) return simPertence;
        if (valor > 1) {
            int anterior = 1;
            int atual = 1;
            for(int cont = 1;cont <= valor;cont++){
                if (atual == valor || anterior == valor) {
                    return simPertence;
                }
                anterior = anterior + atual;
                atual = anterior + atual;
            }
        }
        return naoPertence;
    }
}
