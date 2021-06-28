package com.loiane.cursojava.aula19.labs;

public class Exercicio11 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorPar = new int[5];
		int cont = 0;
		int index = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
		}
		
		for(int j = 0; j<vetorA.length; j++) {
			if (vetorA[j] % 2 == 0) {
				vetorPar[index] = vetorA[j];
				cont = cont + 1;
				index = index + 1;
			}
		}
		
		System.out.println("A quantidade de números pares são: " + cont);
		System.out.print("São eles: ");
		for (int imprimeVetorPar : vetorPar) {
			System.out.print(imprimeVetorPar + " ");
		}
	}
}
