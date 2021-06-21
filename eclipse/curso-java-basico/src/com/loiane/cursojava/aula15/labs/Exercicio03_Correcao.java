package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio03_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F ou M): ");
		String input = scan.next();
		
		if (input.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
