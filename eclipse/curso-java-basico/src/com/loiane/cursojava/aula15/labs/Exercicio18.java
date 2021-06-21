package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número não é par");
		}

	}

}
