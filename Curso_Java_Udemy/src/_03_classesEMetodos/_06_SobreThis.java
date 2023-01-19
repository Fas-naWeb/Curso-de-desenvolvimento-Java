package _03_classesEMetodos;

public class _06_SobreThis {
    /*
     * This e um objeto que refencia o proprio objeto
     */
    String nome;
    String email;
    static String telefone = "(35) 9 98985204";

    /*
     * veja bem aqui se demonstra que voce pode ter mais de um metodo
     * construtor,desde que a assinatura
     * dos metodos sejam diferentes.Note que no primeiro existe um argumento a mais
     * que e o tel.
     * Note tambem que as variaveis de instancia recebem os valores que seram
     * passados por parametro corretamente
     * porque os nomes que estao sendo declarados nos parametros sao diferentes dos
     * atributos de instancia.
     */

    // Aqui eu utilizai o meu construtor padrao para chamar outro construtor
    // existente.
    _06_SobreThis() {

        this("Fabiano Alves Santos", "fasnaweb2020@gmail.com");
    }

    _06_SobreThis(String nome1, String email1, String tel) {
        nome = nome1;
        email = email1;
        _06_SobreThis.telefone = tel;
    }

    /*
     Note que aqui utilizei o this para identificar os atributos de
     instancia,visto que os nomes dos parametros
     sao identicos aos de instancia.
     */
    _06_SobreThis(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public static void main(String[] args) {

        _06_SobreThis obj = new _06_SobreThis();
        System.out.println();
        System.out.println(obj.nome);
        System.out.println(obj.email);
        System.out.println(_06_SobreThis.telefone);
        System.out.println();
        
        _06_SobreThis obj2 = new _06_SobreThis("Tatiana Alves Santos","tasnaweb2021@gmail.com","(35) 9 84596779");
        System.out.println();
        System.out.println(obj2.nome);
        System.out.println(obj2.email);
        System.out.println(_06_SobreThis.telefone);
        System.out.println();
        
    }
}
