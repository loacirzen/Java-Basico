package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorC = new int[20];
		int b=0, c=0;
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Informe o valor do elemento " + i + "° :" );
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[b] = vetorA[i];
				b++;
			}else if (vetorA[i] % 2 != 0) {
				vetorC[c] = vetorA[i];
				c++;
			}
		}
		
		System.out.print("O valores Vetor A: ");
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] +" ");
		}
		
		System.out.println("");
		System.out.print("O valores Vetor B: ");
		for(int i = 0; i<b; i++) {
			System.out.print(vetorB[i] +" ");
		}
		
		System.out.println("");
		System.out.print("O valores Vetor C: ");
		for(int i = 0; i<c; i++) {
			System.out.print(vetorC[i] +" ");
		}
	}
}
