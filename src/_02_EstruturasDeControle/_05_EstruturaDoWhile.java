package _02_EstruturasDeControle;

public class _05_EstruturaDoWhile {
    // O do while sempre executa uma unica vez antes de gerar a repetição,note que essa estrutura e
    // a unica que utiliza ; no final

    public static void main(String[] args) {
        int contador = 0;

        do {
            System.out.println("Fabiano Alves Santos.");
            contador++;
        } while (contador <= 10);
    }
}
