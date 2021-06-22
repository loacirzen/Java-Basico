package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		int maior = 0;
		
		do {
			System.out.println("Digite um valor: ");
			int valor = scan.nextInt();
			
			if(valor > maior) {
				maior = valor;
			}
			cont++;
			
		}while(cont < 5);
		
		System.out.println("O maior valor é: " + maior);
	}
}
