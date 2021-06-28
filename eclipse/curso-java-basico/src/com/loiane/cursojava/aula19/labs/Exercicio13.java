package com.loiane.cursojava.aula19.labs;

public class Exercicio13 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int somaVetorMultiploDeCinco = 0;
		for(int i = 0 ; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
		}
		
		for (int j = 0; j<vetorA.length; j++) {
			if(vetorA[j] % 5 == 0) {
				somaVetorMultiploDeCinco = somaVetorMultiploDeCinco + vetorA[j];
			}
		}
		
		System.out.println("A soma dos elemento multiplo de 5: " + somaVetorMultiploDeCinco);
	}
}
