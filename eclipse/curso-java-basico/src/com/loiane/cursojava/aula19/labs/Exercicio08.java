package com.loiane.cursojava.aula19.labs;

public class Exercicio08 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i+1;
			vetorA[i] = vetorA[i]*5;
		}
		
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = i+1;
			vetorB[i] = vetorB[i]*10;
		}
		
		for(int i = 0; i<vetorC.length; i++) {
			vetorC[i] = i+1;
			vetorC[i] = vetorA[i] * vetorB[i] ;
		}
		
		for(int i = 0; i<vetorC.length; i++) {
			System.out.println("Valores do VetorC[" + i + "] : " + vetorC[i]);
		}
	}
}
