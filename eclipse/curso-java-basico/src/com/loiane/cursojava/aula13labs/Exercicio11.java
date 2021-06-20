package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicio 11");
		System.out.println("Digite um número inteiro: ");
		int inteiro1 = scan.nextInt();
		System.out.println("Digire outro número inteiro: ");
		int inteiro2 = scan.nextInt();
		System.out.println("Digite um número real");
		double real = scan.nextDouble();
		
		double resultado1 = (inteiro1 * 2) % (inteiro2 / 2);
		System.out.println("O produto do dobro do primeiro com metada do segundo: " + resultado1);
		
		double resultado2 = (inteiro1 * 3) + real;
		System.out.println("a soma do triplo com o terceiro: " + resultado2);
		
		double resultado3 = Math.pow(real, 3); 
		System.out.println("O terceiro elevado ao cubo:" + resultado3);

	}

}
