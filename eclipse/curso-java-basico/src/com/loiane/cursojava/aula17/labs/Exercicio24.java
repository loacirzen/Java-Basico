package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o preço do pão:");
		double precoPao = scan.nextDouble(); 
		
		double tabelaPreco = 0;
		int i = 1;
		System.out.println("Loja Quase Dois - Tabela de preços");
		do {
			tabelaPreco=i * precoPao;
			System.out.println(i + " - R$ " + tabelaPreco);
			i++;
		}while(i < 51);
	}
}
