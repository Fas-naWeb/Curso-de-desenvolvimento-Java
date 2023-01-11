package _03_classesEMetodos;

public class _03_MetodosConstrutores {
    /*
       Metodo construtor você pode ter mais de um,se você não escrever nenhum construtor, o java fornece 
       um construtor padrão para você.Um construtor padrao não possui retorno.O construtor quando criado pelo
       programador tem que ter o mesmo nome da classe.
     */

     String nome;
     String email;
     String telefone;
    /*
     Aqui voce tem um construtor padrao
     _03_classesEMetodos(){

     }
    */
     _03_MetodosConstrutores(String nome,String email,String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
     }

      public static void main(String[] args) {
       _03_MetodosConstrutores obj = new _03_MetodosConstrutores("Fabiano Alves Santos","fasnaweb2020@gmail.com","(35)9 98985204");
       
       System.out.println();
       System.out.println(obj.nome);
       System.out.println(obj.email);
       System.out.println(obj.telefone);
       System.out.println();
     }
}
