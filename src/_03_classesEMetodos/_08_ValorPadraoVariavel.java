package _03_classesEMetodos;

public class _08_ValorPadraoVariavel {
    String nome;

    _08_ValorPadraoVariavel(String nome){
        this.nome = nome;
    }

    public static void main(String[] args) {
        /*
           Variaveis criadas dentro de classe como atributo iniciali-se com valores padrao,no caso
           quando voce programador nao define nada.
           
           bute,short,int,long -> O valor padrao e 0
           float,double -> Ovalor padrao e 0.0
           boolean -> O valor padrao e false
           char -> '\u0000'
           String -> null Significa que a variavel nao aponta pra lugar nenhum no caso o objeto String 
           
           Mais quando voce define uma variavel local a mesma nao possui valor padrao voce tem que definir 
           o valor se nao ocorre um erro.
        */

        int numero;
        int numero2 = 19;
        //System.out.println(numero); // Note que aqui gera um erro pois a variavel local nao foi inicializada.
        System.out.println(numero2); // Note que aqui nao gera um erro pois a variavel local  foi inicializada.
    }
}
