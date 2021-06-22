package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com outro inteiro: ");
		int num2 = scan.nextInt();
		
		int maior = 0;
		int menor = 0;
		
		if(num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		
		for ( ; menor < maior ; menor++ ) {
			System.out.println(menor);
		}
	}

}
