package com.loiane.cursojava.aula19.labs;

public class Exercicio07 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i+1;
			vetorA[i] = vetorA[i] * 15;
		}
		
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = i+1;
			vetorB[i] = vetorB[i] * 10;
		}
		
		for(int i = 0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		for (int valoresVetorC : vetorC) {
			System.out.println("Valores do VetorC: " + valoresVetorC);
		}
	}
}


