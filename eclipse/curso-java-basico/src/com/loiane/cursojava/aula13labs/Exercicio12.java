package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicio 12");
		System.out.println("Digite sua altura: ");
		double suaAltura = scan.nextDouble();
		double pesoIdeal = (76.7 * suaAltura) - 58;
		System.out.println("Seu peso ideal é: " + pesoIdeal);

	}

}
