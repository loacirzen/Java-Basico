package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		double soma = 0;
		
		do {
			System.out.println("Digite um valor: ");
			double valor = scan.nextDouble();
			soma = soma + valor;
			cont++;
			
		}while(cont < 5);
		
		double media = soma / cont;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A media é: " + media);
	}

}
