package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int maxNum = scan.nextInt();	
		int cont = maxNum;
		
		for (int i = 1; i < maxNum ; i++) {
			int contPrimo = 0;
			do {			
				if((i % cont == 0) && (i % 1 == 0)) {
					contPrimo++;
				}
				cont--;
			}while(cont > 0);
			
			if(cont==0) {
				cont = maxNum;
			}
			
			if(contPrimo <= 2) {
				System.out.print(i + " - ");
			}
			
			contPrimo = 0;
		}		
	}
}
