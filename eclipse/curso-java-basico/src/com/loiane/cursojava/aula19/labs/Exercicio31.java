package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Digite um valor para posicao " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0 , x =0 ,y = vetorA.length; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[x] = vetorA[i];
				x ++;
			} else if(vetorA[i] % 2 != 0){
				vetorB[y-1] = vetorA[i];
				y--;
			}
		}
		
		System.out.print("Os valores do vetor B: ");
		for (int imprimeVetorB : vetorB) {
			System.out.print(imprimeVetorB + " ");
		}
	}
}
