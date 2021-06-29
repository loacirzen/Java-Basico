package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Digite o valor para o elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0 ) {
				vetorB[i] = 1;
			} else if (vetorA[i] % 2 != 0) {
				vetorB[i] = 0;
			}
		}
		
		System.out.print("Valores vetorB: ");
		for(int imprimeVetorB : vetorB) {
			System.out.print(imprimeVetorB + " ");
		}
	}
}
