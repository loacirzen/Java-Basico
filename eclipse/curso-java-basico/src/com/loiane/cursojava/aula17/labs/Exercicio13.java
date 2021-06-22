package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número da base:");
		int base = scan.nextInt();
		
		System.out.println("Digite o número do expoente:");
		int expoente = scan.nextInt();
		
		int cont = expoente;
		long result = 1L;
		
		while(cont > 0) {
			result = result * base;
			cont--;
		}
		
		if(result == 0) {
			System.out.println("O resultado ultrapassa o valor máximo");
		}else {
			System.out.println(base + " a potência de " + expoente + " = " + result);
		}
	}
}
