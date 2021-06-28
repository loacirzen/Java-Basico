package com.loiane.cursojava.aula19.labs;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		for (int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i+5;
		}
		
		for (int j = 0; j<vetorB.length; j++) {
			vetorB[j] = vetorA[j] * 2;
		}
		
		for(int valoresVetorB : vetorB) {
			System.out.println("Valores Vetor B " + valoresVetorB);
		}

	}

}
