package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o em Farenheit: ");
		double farenheit = scan.nextDouble();
		double celsius = ( 5 * (farenheit - 32)/9);
		System.out.println("A temperatura em Celsius é: " + celsius);
		
	}

}
