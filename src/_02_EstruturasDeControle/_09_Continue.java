package _02_EstruturasDeControle;

public class _09_Continue {
    public static void main(String[] args) {
        for(int i = 0; i <= 50;i++){
            System.out.println(i);
            if(i == 10){
                System.out.println("Pulou o numero 10 ");
                continue;
            }
        }
    }
}
