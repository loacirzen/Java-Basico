package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;
public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o número de termos: ");
		int num = scan.nextInt();
		double result = 0;
		
		System.out.print("S = ");
		
		for(int i=0, a=1, b=1 ; i < num ; a++, b=b+2, i++) {
			double calc = a/b; 
			System.out.println(calc);
			System.out.print(a + "/" + b + " + ");
			result = result + calc;
		}
		System.out.println("");
		System.out.print("A soma da série: " + result);
	}
}
