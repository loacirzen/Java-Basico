package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Digite um valor para elemento " + i + " do vetor A :");
			vetorA[i] = scan.nextInt();
			System.out.print("Digite um valor para elemento " + i + " do vetor B :");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			} else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}
		}
		System.out.print("Elemento do vetor C: ");
		for(int imprimeVetorC : vetorC) {
			System.out.print(imprimeVetorC + " ");
		}
	}
}
