package _01_fundamentos;

public class _15_OperadoresLogicos {
    public static void main(String[] args) {
        boolean v = true;
        boolean f = false;

        // Operador lógico E && Ambos tem que ser verdadeiro para resultar verdadeiro
        System.out.println(v && true );
        System.out.println(v && f);
        System.out.println(f && v);
        System.out.println(f && false);

        System.out.println("----------------------------------");
        
        // Operador OU || Basta apenas um ser verdadeiro para que o resultado seja verdadeiro
        System.out.println(v || true);
        System.out.println(v || f);
        System.out.println(f || v);
        System.out.println(f || false);
        
        System.out.println("----------------------------------");

        System.out.println(!v);
        System.out.println(!f);
        
        System.out.println("----------------------------------");


    }
}
