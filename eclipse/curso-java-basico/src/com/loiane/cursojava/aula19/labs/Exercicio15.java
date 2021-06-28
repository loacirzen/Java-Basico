package com.loiane.cursojava.aula19.labs;

public class Exercicio15 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorPar = new int [5];
		int[] vetorImpar = new int [5];
		int contPar = 0, contImpar = 0;
		double mediaPar = 0, mediaImpar = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
		}
		
		for(int j = 0; j<vetorA.length; j++) {
			if(vetorA[j] % 2 == 0) {
				vetorPar[contPar] = vetorA[j];
				contPar ++;
			}else {
				vetorImpar[contImpar] = vetorA[j];
				contImpar ++;
			}
		}
		
		mediaPar = (contPar * 100) / vetorA.length;
		mediaImpar = (contImpar * 100) / vetorA.length;
		
		System.out.print("Os valores de Par: ");
		for (int imprimeVetorPar : vetorPar) {
			System.out.print(imprimeVetorPar + " ");
		}
		System.out.println("");
		System.out.println("A porcentagem de número Par é de: " + mediaPar + "%");
		
		System.out.print("Os valores de Impar: ");
		for (int imprimeVetorImpar : vetorImpar) {
			System.out.print(imprimeVetorImpar + " ");
		}
		System.out.println("");
		System.out.println("A porcentagem de número Impar é de: " + mediaImpar + "%");
	}
}
