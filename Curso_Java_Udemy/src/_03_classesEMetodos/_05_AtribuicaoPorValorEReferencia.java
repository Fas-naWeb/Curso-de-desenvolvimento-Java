package _03_classesEMetodos;

public class _05_AtribuicaoPorValorEReferencia {
    /*
     * Valores de variaveis criados com tipos primitivos e criado um espaço de
     * memoria para cada valor
     * de variavel criada.
     * 
     * Valores de variaveis criadas por referencia do tipo objeto,e criado um espaco
     * na memoria,porem se voce
     * apontar outra variavel para essa variavel do tipo objeto ela recebera o
     * endereco dessa variavel..
     * verificando com exemplo:
     */

    String nome;
    String email;
    static final String telefone = "(35) 9 98985204";

    _05_AtribuicaoPorValorEReferencia(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public static void main(String[] args) {

        /*
         * Explicando melhor,temos aqui embaixo duas variaveis do tipo primitivo note
         * que cada uma
         * possui um espaco na memoria do computador e que modifiquei o valor de cada uma individualmete;
         */
        int A = 40;
        int B = A; // Recebeu uma copia de A

        System.out.println();
        System.out.println(A);
        System.out.println(B);
        A++;
        B--;
        System.out.println(A);
        System.out.println(B);
        System.out.println();
        
        // Aqui voce vai verificar que ambos objetos apontam para o mesmo endereco de memoria
        _05_AtribuicaoPorValorEReferencia obj = new _05_AtribuicaoPorValorEReferencia("Fabiano",
                "fasnaweb2020@gmail.com");
        _05_AtribuicaoPorValorEReferencia obj2 = obj; // Recebeu o endereco de memoria de obj

        System.out.println(obj.nome);
        System.out.println(obj.email);
        System.out.println(_05_AtribuicaoPorValorEReferencia.telefone);
        
        System.out.println();
        System.out.println(obj2.nome);
        System.out.println(obj2.email);
        System.out.println(_05_AtribuicaoPorValorEReferencia.telefone);
    }
}
