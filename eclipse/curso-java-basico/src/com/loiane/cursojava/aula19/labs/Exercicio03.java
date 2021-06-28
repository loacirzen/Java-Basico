package com.loiane.cursojava.aula19.labs;

public class Exercicio03 {

	public static void main(String[] args) {
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for(int i = 0; i<vetorA.length ; i++) {
			vetorA[i] =  i*5;
		}
		
		for(int j = 0; j<vetorB.length; j++) {
			vetorB[j] = vetorA[j] * vetorA[j];
		}
		
		for (int valoresVetorB : vetorB) {
			System.out.println("Valores Vetor B: " + valoresVetorB);
		}
	}

}
