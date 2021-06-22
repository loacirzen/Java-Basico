package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = scan.nextInt();	
		int cont = num;
		int contPrimo = 0;
		do {
			if((num % cont == 0) && (num % 1 == 0)) {
				contPrimo++;
			}
			cont--;
		}while(cont > 0);
		
		if(contPrimo >= 3) {
			System.out.println("O número não é primo");
		}else {
			System.out.println("O número é primo");
		}
	}
}
