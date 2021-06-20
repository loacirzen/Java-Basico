package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para A: ");
		double numA = scan.nextDouble();
		System.out.println("Digite um número para B: ");
		double numB = scan.nextDouble();
		
		if(numA > numB) {
			System.out.println("O valor de A é mair que B");
		}else {
			System.out.println("O valor de B é mair que A");
		}
		
	}

}
