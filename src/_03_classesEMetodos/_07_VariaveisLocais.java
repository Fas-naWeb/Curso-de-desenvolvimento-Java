package _03_classesEMetodos;

public class _07_VariaveisLocais {
    /*
        Variaveis global sao declaradas fora de metodos,e variaveis locais estao sempre dentro 
        de um metodo.   
    */

    String nome; // global
    String email; // global
    String telefone;//global

    _07_VariaveisLocais(String nome,String email,String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Note que consigo acessar a variavel nome dentro do metodo
    String mostrarIdade(int idade){
        int id = idade;
        return "Nome:" + nome + "Idade:" + id;
    }

    //Porem aqui nao consigo acessar a variavel idade de dentro do metodo gera um erro pois nao reconhece a variavel
    // que esta dentro do metodo.
    //int idade2 = idade;



    public static void main(String[] args) {
        //Vamos acessar as variaveis para ver como as mesmas se comportam
        System.out.println();
        _07_VariaveisLocais obj = new _07_VariaveisLocais("Fabiano Alves Santos","fasnaweb2020@gmail.com","(35) 9 98985204");
        System.out.println(obj.mostrarIdade(40));
        System.out.println();
        
    }
}
