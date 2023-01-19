package _03_classesEMetodos;

public class _04_MembroClasseVsDeInstancia {
    /*
       Membros de instância esta associado ao objeto e membros de classe esta associado a classe.
       Quando se cria um atributo e o mesmo e declarado como static,isso significa que esse atributo
       pertence a classe e não tera uma copia dele no objeto..
     */
     
     // Atributos da classe
     String nome;
     String email;
     static String telefone;

     _04_MembroClasseVsDeInstancia(String nome,String email){
        this.nome = nome;
        this.email = email;
     }

     public static void main(String[] args) {
        _04_MembroClasseVsDeInstancia obj = new _04_MembroClasseVsDeInstancia("Fabiano","fasnaweb2020@gmail.com");

        // Note que eu so consigo acessar o atributo telefone se acessar diretamente da classe,pois ele e um atributo de classe
        _04_MembroClasseVsDeInstancia.telefone = "(35)9 98985204";

        System.out.println();
        // Aqui voce consegue acessar apenas os atributos nome e email por que sao atributos de objeto.
        System.out.println(obj.nome);
        System.out.println(obj.email);
        System.out.println(_04_MembroClasseVsDeInstancia.telefone);
        System.out.println();
     }
}
