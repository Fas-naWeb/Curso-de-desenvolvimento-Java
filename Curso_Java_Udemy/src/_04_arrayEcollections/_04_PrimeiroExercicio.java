import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;
//
public class _04_PrimeiroExercicio {
    public static void main(String[] args) {
        int numNotas;
        double mediad,soma = 0;
        String[] cardinais = {"Primeira","Segunda","Terceira","Quarta"};
        Scanner entradas = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o nome do aluno:");
        String nome = entradas.nextLine();

        System.out.print("Entre com a quantidade de notas:");
        numNotas = entradas.nextInt();
        Double[] notasAluno = new Double[numNotas];

         for(int i = 0;i < cardinais.length;i++){
             System.out.printf("Entre com a %s Nota: ",cardinais[i]);
             notasAluno[i] = entradas.nextDouble();
         }
         System.out.println(Arrays.toString(notasAluno));

             

        System.out.println();
        entradas.close();

    }
}
