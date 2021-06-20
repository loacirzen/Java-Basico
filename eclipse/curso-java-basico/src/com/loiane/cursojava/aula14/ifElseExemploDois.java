package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElseExemploDois {
	
	public static void main(String[] args) {
		
		//barato <= 10
		//10 < valor < 15 - pedir descontos
		//15 <= valor 17 - pesquisar mais 
		//>=17 - muito caro
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o preço: ");
		double preco = scan.nextDouble();
		if (preco <= 10) {
			System.out.println("Barato");
		} else if (preco > 10 && preco < 15) {
			System.out.println("Pedir desconto");
		} else if (preco >= 15 && preco < 17) {
			System.out.println("Pesquisar mais");
		}else {
			System.out.println("Muito caro");
		}
		
	}

}
