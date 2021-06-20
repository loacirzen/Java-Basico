package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Exercicio 10");
		System.out.println("Digite o em Celsius: ");
		double c = scan.nextDouble();
		double f = (c * 1.8) + 32; 
		System.out.println("A temperatura em Farenheit é: " + f);
	}

}
