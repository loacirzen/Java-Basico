package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Entre com um valor para posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("------- Tabuada do : " + vetorA[i] + " -------");
			for(int j=0; j<11; j++) {
				System.out.println(vetorA[i] + " X " + j + " = " + vetorA[i] * j);
			}
		}
	}
}
