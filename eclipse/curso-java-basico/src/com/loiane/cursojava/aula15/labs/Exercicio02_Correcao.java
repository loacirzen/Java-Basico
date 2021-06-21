package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("O número informado é positivo");
		} else {
			System.out.println("O número informado é negativo");
		}
	}
}
