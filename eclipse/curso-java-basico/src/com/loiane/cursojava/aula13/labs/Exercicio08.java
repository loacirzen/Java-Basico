package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicio 08");
		System.out.println("Digite a quantidade quanto você ganha por hora: ");
		double qtdValorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhada no mês");
		double qtdHorasMes = scan.nextDouble();
		double salarioMes = qtdHorasMes * qtdValorHora;
		System.out.println("Seu salario no mês será: " + salarioMes);

	}

}
