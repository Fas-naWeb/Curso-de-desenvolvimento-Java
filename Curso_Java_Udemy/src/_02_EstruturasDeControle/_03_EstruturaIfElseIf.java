package _02_EstruturasDeControle;

import java.util.Scanner;

public class _03_EstruturaIfElseIf {
    public static void main(String[] args) {
        
        Scanner entradas = new Scanner(System.in);
        
        System.out.println("Digite uma nota: ");
        double nota1 = entradas.nextDouble();

        if (nota1 > 10 || nota1 < 0) {
             System.out.println("Nota é invalida!");
        }else if(nota1 >= 8.1){
            System.out.println("Conceito A");
        }else if(nota1 >= 4.1 && nota1 < 8.1){
            System.out.println("Conceito B");
        }else{
            System.out.println("Conceito C");
        }

        System.out.println("Fim.....");
        entradas.close();
    }
}
