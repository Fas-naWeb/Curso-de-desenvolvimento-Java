package _01_fundamentos;

public class _16_OperadorDeAtribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c = c + b;

        c += b;
        c -= a;
        c *= b;
        c /= a;
        c %= 2; // Aqui pode resultar como par ou impar

        c++; // E o mesmo que dizer c += 1 

        System.out.println(c);
    }
}
