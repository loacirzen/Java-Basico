package com.loiane.cursojava.aula19.labs;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i;
		}
		
		for(int j = 0; j<vetorB.length; j++) {
			vetorB[j] = vetorA[j] * j; 
		}
		
		for (int valoresVetorB : vetorB) {
			System.out.println("Valores do vetorB: " + valoresVetorB);
		}
	}
}
