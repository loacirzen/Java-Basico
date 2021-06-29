package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i =0 ; i<vetorA.length; i++) {
			System.out.print("Digite um valor para posição "+ i +"° : ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("");
			for(int j = 0; j<vetorA[i] + 1; j++) {
				System.out.print(j + " - ");
			}
		}
	}
}
