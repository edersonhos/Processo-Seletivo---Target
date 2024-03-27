package src;

public class Main {
    public static void main (String[] args){
        // Exercisio 2
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.pertence(21));
        System.out.println(fibonacci.pertence(12));

        // Exercisio 5
        String mensagem = "Ederson Henrique";
        InventeString texto = new InventeString();
        System.out.println(InventeString.inverter(mensagem));
    }
}
