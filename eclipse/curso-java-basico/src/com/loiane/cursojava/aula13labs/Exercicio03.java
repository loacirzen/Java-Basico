package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicio 03");
		System.out.println("Digite o Primeiro número: ");
		int numeroUm = scan.nextInt();
		System.out.println("Digite o Segundo número: ");
		int numeroDois = scan.nextInt();
		int soma = numeroUm + numeroDois;
		System.out.println("A soma é: " + soma);
	

	}

}
