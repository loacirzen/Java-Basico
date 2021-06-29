package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		int[] vetorA = new int[11];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.pow(2, i);
		}
		
		for(int imprimeVetorA : vetorA) {
			System.out.println(imprimeVetorA);
		}
	}
}
