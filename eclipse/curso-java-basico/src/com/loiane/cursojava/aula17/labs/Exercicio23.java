package com.loiane.cursojava.aula17.labs;

public class Exercicio23 {

	public static void main(String[] args) {
		double preco = 0;
		int i = 1;
		System.out.println("Loja Quase Dois - Tabela de preços");
		do {
			preco=i * 1.99;
			System.out.println(i + " - R$ " + preco);
			i++;
		}while(i < 51);
	}
}
