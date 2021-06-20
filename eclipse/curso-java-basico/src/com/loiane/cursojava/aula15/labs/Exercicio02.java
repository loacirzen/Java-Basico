package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor numerico inteiro positivo ou negativo: ");
		int valor = scan.nextInt();
		if (valor >=1 ) {
			System.out.println("O valor é positivo");
		} else if (valor < 0) {
			System.out.println("O valor é negativo");
		} else if (valor == 0) {
			System.out.println("Você digitou 0");
		}

	}

}
