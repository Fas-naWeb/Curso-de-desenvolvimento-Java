package _01_fundamentos;

import java.util.Scanner;

public class _14_OperadoresAritmeticos {

	public static void main(String[] args) {
		 Scanner entradas =  new Scanner(System.in);
	        double a = 0;
	        double b = 0;

	        System.out.println("Entre com um primeiro valor:");
	        a = entradas.nextDouble();

	        System.out.println("Entre com um segundo valor:");
	        b = entradas.nextDouble();

	        System.out.println(a + b);
	        System.out.println(a - b);
	        System.out.println(a * b);
	        System.out.println(a / b);
	        System.out.println(a % b);
	        entradas.close();
	}
}
