package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a qtd de CDs");
		int qtdCD = scan.nextInt();
		double somaPrecoCD = 0;
		
		for(int i = 1; i < qtdCD + 1 ; i++) {
			System.out.println("Digite o preço para o " + i + "° CD: " );
			double precoCD = scan.nextDouble();
			somaPrecoCD = somaPrecoCD + precoCD;
		}

		double mediaPreco = (somaPrecoCD / qtdCD);
		System.out.println("O valor total investido foi: " + somaPrecoCD);
		System.out.println("O valor médio de cada CD foi: " + mediaPreco);
	}

}
