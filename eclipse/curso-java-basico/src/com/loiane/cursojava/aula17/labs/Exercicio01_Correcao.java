package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com uma nota: ");
			double nota = scan.nextDouble();
			if (nota >=0 && nota <=10 ) {
				System.out.println("Você digitou a nota: " + nota);
			}else {
				System.out.println("Nota inválida, digite novamente: ");
			}
			
		} while(!notaValida);
	}
}
