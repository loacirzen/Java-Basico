package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Exercicio 04");
		System.out.println("Digite a nota do primeiro bimestre: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a nota do segundo bimestre: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a nota do terceiro bimestre: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a nota do quarto bimestre: ");
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media foi: " + media);

	}

}
