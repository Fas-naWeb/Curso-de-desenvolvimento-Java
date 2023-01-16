package _01_fundamentos;

import java.util.Arrays;

public class _20_TesteDeCompilacao {
    public static void main(String[] args) {
            /*
      ALGUMAS INFORMAÇÕES SOBRE ARRAYS
    
         # Um array é uma estrutura statica,uma vez criado você não pode mudar seu tamanho.Ele possui 
         # um tamanho fixo.
    
         # Um array e homogeneo ou seja possui dados do mesmo tipo.(ou só String,ou só int ou só double ....) 
         
         # Um array é uma estrutura indexada que inicia por zero
    
         # Um array é um objeto.
    */
    
        // Uma das formas de criar um array 
        // Significa a quantidade de elementos que esse array tem
       double[] notasAlunos = new double[3];
       System.out.println(Arrays.toString(notasAlunos));
        
        // Como adicionar notas ao array
        notasAlunos[0] = 7.9;
        notasAlunos[1] = 8;
        notasAlunos[2] = 6.7;
        
        System.out.println(Arrays.toString(notasAlunos));
        System.out.println();
    
        double total = 0;
        for(int i = 0;i < notasAlunos.length;i++){
            total += notasAlunos[i];
        }
        System.out.println(total / notasAlunos.length);
        System.out.println();
    
        // Outro forma de iniciar um array
        double[] notas = {3.5,4.6,8.7};
    
        // Pegar a ultima nota do aluno
        System.out.println(notas[notas.length - 1]);
    }
}
