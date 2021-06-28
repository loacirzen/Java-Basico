package com.loiane.cursojava.aula19.labs;

public class Exercicio12 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int somaVetor = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = (i+1) * 2;
		}
		
		for(int j = 0; j<vetorA.length; j++) {
			somaVetor = somaVetor + vetorA[j]; 
		}
		
		
		System.out.print("Os valores: ");
		for (int imprimeVetor : vetorA) {
			System.out.print(imprimeVetor + " ");
		}
		System.out.println("");
		System.out.println("A soma é: " + somaVetor);

	}
}
