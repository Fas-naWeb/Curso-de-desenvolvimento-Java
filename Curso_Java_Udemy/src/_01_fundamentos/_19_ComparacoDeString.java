package _01_fundamentos;

import java.util.Scanner;

public class _19_ComparacoDeString {
    public static void main(String[] args) {
       System.out.println("2" == "2"); 

       String s1 = new String("2");
       System.out.println("2" == s1);
       System.out.println("2".equals(s1));
       
       Scanner entradas = new Scanner(System.in);
       String s2 = entradas.next();
       
       System.out.println("2" == s2.trim());
       System.out.println("2".equals(s2.trim()));
       entradas.close();
    }
}
