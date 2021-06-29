package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		//char[] vetorA = new char[10];
		char[] vetorA = new char[10];
		char[] vetorB = new char[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Digite um valor para o elemento " + i + "° : ");
			vetorA[i] =  scan.nextLine().charAt(0);
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			}else if (vetorA[i] > 10) {
				vetorB[i] = 'e';
			}
		}
		
		System.out.print("Valores Vetor B: ");
		for(int i = 0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}
