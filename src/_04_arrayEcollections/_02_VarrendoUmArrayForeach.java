package _04_arrayEcollections;

public class _02_VarrendoUmArrayForeach {
    public static void main(String[] args) {
        double[] notasAlunos = {9.2,1.3,4.5,6.7,8.9};
        // foreach em java nao se escreve foreach usa-se o for mas com nomeclatura diferente.
        for(double nota: notasAlunos){
            System.out.println(nota);
        }
    }
}
