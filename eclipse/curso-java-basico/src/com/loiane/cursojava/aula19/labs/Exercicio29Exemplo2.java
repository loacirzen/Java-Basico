package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio29Exemplo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];

		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Divite o elemento " + i + " do vetorA: ");
			vetorA[i] = scan.nextInt();
			System.out.print("Divite o elemento " + i + " do vetorB: ");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0, x =0; i<vetorA.length; i++) {
			for(int y = vetorA.length; y<vetorC.length; y++) {
				if(i >= 9) {
					vetorC[y] = vetorB[x];
					x++;
				}else {
					vetorC[i] = vetorA[i];
				}
			}
		}
		
		System.out.print("Os valores Vetor C: ");
		for(int i = 0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}
}
