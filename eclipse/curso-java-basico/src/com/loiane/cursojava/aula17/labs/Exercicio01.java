package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota;
		
		do {
		System.out.println("Digite uma nota: ");
		nota = scan.nextDouble();
			if(nota < 0 || nota > 10) {
				System.out.println("valor inválido");
			}
		
		}while(nota < 0 || nota > 10);
		
		System.out.println("A nota digitada foi: " + nota);
	}

}
