package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com valor para o n-ésimo termo Fibonacci");
		int numTerno = scan.nextInt();
		for(int a=0, b=1, i=0; i<numTerno; b+=a, a=b-a, i++) {
			System.out.print(a + " ");
		}  
	}
}
