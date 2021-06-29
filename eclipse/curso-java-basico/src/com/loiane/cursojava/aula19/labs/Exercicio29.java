package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];
		int count = vetorA.length;
		int index = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Divite o elemento " + i + " do vetorA: ");
			vetorA[i] = scan.nextInt();
			System.out.print("Divite o elemento " + i + " do vetorB: ");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i<vetorC.length ; i++) {
			if(i >= vetorA.length) {
				vetorC[count] = vetorB[index];
				count ++;
				index++;
			}else {
				vetorC[i] = vetorA[i];
			}
		}
		
		System.out.print("Os valores do Vetor C: ");
		for(int i = 0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}
}
