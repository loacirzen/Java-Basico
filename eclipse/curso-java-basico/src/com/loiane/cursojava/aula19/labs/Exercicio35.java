package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i =0 ; i<vetorA.length; i++) {
			System.out.print("Digite um valor para posição "+ i +"° : ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int j = 0; j<vetorA.length; j++) {
			System.out.println("");
			System.out.print("O elemnto " + j + " cujo valor é " + vetorA[j] + " tem os divisores: ");
			int cont = vetorA[j];	
			do {
				if(vetorA[j] % cont == 0) {
					System.out.print(cont + " ");
				}
				cont--;
			}while(cont > 0);		
		}
	}
}
