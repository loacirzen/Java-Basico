package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int cont = 0;
		
		for(int i = 0; i<vetorA.length ; i++) {
			System.out.print("Digite a "+ i + "° idade :");
			vetorA[i] = scan.nextInt();
		}
		
		for(int j = 0; j<vetorA.length; j++) {
			if(vetorA[j] > 35) {
				cont++;
			}
		}
		System.out.println("");
		System.out.print("A quantidade de pessoal com idade superior a 35 é: " + cont);
	}
}
