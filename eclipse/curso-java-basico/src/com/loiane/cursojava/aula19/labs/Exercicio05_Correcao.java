package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Entre com o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("");
		System.out.print("Vetor B = ");
		for(int i = 0; i<vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}


	}

}
