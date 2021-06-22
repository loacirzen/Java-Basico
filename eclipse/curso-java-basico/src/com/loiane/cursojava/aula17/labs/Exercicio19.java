package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a qtd de notas: ");
		int qtdNotas = scan.nextInt();
		double somaNota = 0;
		int cont = qtdNotas;
		
		do {
			System.out.println("Digite uma nota " + cont + " : ");
			double nota = scan.nextDouble();
			somaNota = somaNota + nota;
			cont--;
		}while(cont > 0);

		double mediaNota = somaNota / qtdNotas;
		System.out.println("A soma notas: " + somaNota);
		System.out.println("A media é: " + mediaNota);
	}

}
