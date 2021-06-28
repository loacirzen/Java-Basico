package com.loiane.cursojava.aula19.labs;

public class Exercicio04 {

	public static void main(String[] args) {
		int[] vetorA = new int[15];
		double[] vetorB = new double[15];
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i;
		}
		
		for(int j = 0 ; j<vetorB.length ; j++ ) {
			vetorB[j] = Math.sqrt(vetorA[j]);
		}
		
		for (double valoresVetorB : vetorB) {
			System.out.println("--> " + valoresVetorB);
		}
	}

}
