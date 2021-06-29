package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Digite um valor para o " + i + "° elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0, j = vetorA.length; i<vetorA.length; i++, j--) {			
			vetorB[j-1] = vetorA[i];
		}
		
		System.out.print("Os valores do vetor: ");
		for (int i = 0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}
