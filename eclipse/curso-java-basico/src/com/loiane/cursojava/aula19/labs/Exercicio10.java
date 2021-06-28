package com.loiane.cursojava.aula19.labs;

public class Exercicio10 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i+1;
			vetorA[i] = vetorA[i] * 5;
		}
		
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = vetorA[i] % 2;
		}
		
		for(int valoresVetorB : vetorB) {
			System.out.println("Valores de vetorB: " + valoresVetorB);
		}
	}
}
