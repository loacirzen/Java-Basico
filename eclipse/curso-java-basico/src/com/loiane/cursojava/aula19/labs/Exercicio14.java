package com.loiane.cursojava.aula19.labs;

public class Exercicio14 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int somaVetorImpares = 0;
		int cont = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
		}
		
		for(int j = 0; j<vetorA.length; j++) {
			if (vetorA[j] % 2 != 0) {
				somaVetorImpares = somaVetorImpares + vetorA[j];
				cont = cont + 1;
			}
		}
		
		double mediaVetorImpares = somaVetorImpares / cont;
		System.out.println("A media dos valores impares: " + mediaVetorImpares);
	}

}
