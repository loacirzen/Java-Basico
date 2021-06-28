package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int menorIdade = 200, indexMenorIdade = 0;
		int maiorIdade = 0, indexMaiorIdade = 0;
		
		for(int i = 0; i<vetorA.length ; i++) {
			System.out.print("Digite a " + i + "° idade: ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int j = 0; j< vetorA.length; j++) {
			if(vetorA[j] < menorIdade) {
				menorIdade = vetorA[j];
				indexMenorIdade = j;
			}
			
			if(vetorA[j] > maiorIdade) {
				maiorIdade = vetorA[j];
				indexMaiorIdade = j;
			}
		}
		
		System.out.println("A menor idade é: " + menorIdade + " na posição: " + indexMenorIdade);
		System.out.println("A maior idade é: " + maiorIdade + " na posição: " + indexMaiorIdade);
	}
}
