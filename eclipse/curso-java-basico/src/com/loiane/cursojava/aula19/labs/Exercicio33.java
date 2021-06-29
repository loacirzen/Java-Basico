package com.loiane.cursojava.aula19.labs;
import java.util.Scanner;
public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] vetorA = new int[10];
		int contPrimo = 0;
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Informa um valor para o elemento " + i + "° : ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i<vetorA.length; i++) {
			int cont = vetorA[i];	
			do {
				if((vetorA[i] % cont == 0) && (vetorA[i] % 1 == 0)) {
					contPrimo++;
				}
				cont--;
			}while(cont > 0);		
			
			if(contPrimo >= 3) {
				System.out.println("O elemento "+ i + " cujo valor é " + vetorA[i] + " é um número não é primo");
			}else {
				System.out.println("O elemento "+ i + " cujo valor é " + vetorA[i] + " é um número primo");
			}
			
			contPrimo = 0;
		}
	}
}
