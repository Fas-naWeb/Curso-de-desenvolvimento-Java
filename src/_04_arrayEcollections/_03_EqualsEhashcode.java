package _04_arrayEcollections;

public class _03_EqualsEhashcode {

    String nome = "Fabiano";
    public static void main(String[] args) {
        /*
           Essa aula explica como fazer comparação de igualdade tanto com tipos
           primitivos quanto com tipos objeto.
         */

         // Quando utilizamos o operador == com tipos primitivos conseguimos obter
         // resultado correto pois o mesmo compara o valor das variaveis.
        int a = 2;
        int b = a;
        System.out.println(a == b);

        /*
          Quando se trata de valor por referencia tipos objeto o mesmo operador == nao
          da o mesmo resultado pois variaveis por referencia possuem enderecos de memoria diferentes.   
        */

        _03_EqualsEhashcode obj1 = new _03_EqualsEhashcode();
        _03_EqualsEhashcode obj2 = new _03_EqualsEhashcode();
        obj1.nome = "Fabiano";
        obj2.nome = "Fabiano";
         // Quando utilizamos o operador == com tipos por referencia o resuldado e falso porque aqui
         // estamos comparando endereços de memoria diferentes.
        System.out.println(obj1 == obj2);
    }
}
