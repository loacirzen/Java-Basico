package com.loiane.cursojava.aula19.labs;

public class Exercicio09 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		double[] vetorC = new double[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i+3;
			vetorA[i] = vetorA[i] * 90;
		}
		
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = i+1;
			vetorB[i] = vetorB[i] * 3;
		}
		
		for(int i = 0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		for(double valoresVetorC : vetorC) {
			System.out.println("VetorC " + valoresVetorC);
		}

	}

}
