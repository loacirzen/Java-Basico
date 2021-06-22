package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contPar = 0;
		int contImpar = 0;
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println("Digite um valor inteiro: ");
			int valor = scan.nextInt();
			
			if (valor % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}	
		}
		
		System.out.println("quantidade de números par: " + contPar);
		System.out.println("quantidade de números impar: " + contImpar);
	}
}
