package _04_arrayEcollections;

import java.util.Arrays;
import java.util.Scanner;


public class _04_PrimeiroExercicio {
    public static void main(String[] args) {
        int numNotas;
        double soma = 0;
        String[] cardinais = {"Primeira","Segunda","Terceira","Quarta"};
        Scanner entradas = new Scanner(System.in);
        
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
         
         for(double notas: notasAluno) {        	 
        	 soma = soma + notas;
         }

         double media = soma / notasAluno.length;
         //System.out.println(soma);
         System.out.printf("Média do Senhor(a) %s é %.2f: ",nome,media);

        
        entradas.close();

    }
}
