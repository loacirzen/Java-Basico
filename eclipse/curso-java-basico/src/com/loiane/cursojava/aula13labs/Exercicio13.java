package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicio 13");
		System.out.println("Digite a quantidade quanto você ganha por hora: ");
		double qtdValorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhada no mês");
		double qtdHorasMes = scan.nextDouble();
		double salarioMes = qtdHorasMes * qtdValorHora;
		System.out.println("Seu salario no mês será: " + salarioMes);
		
		double ir = (salarioMes * 11) / 100;
		double inss = (salarioMes * 8) / 100;
		double sindicato = (salarioMes * 5) / 100;
		double salarioLiquido = salarioMes - ir - inss - sindicato;
		
		System.out.println("O salario liquido é: " + salarioLiquido);

	}

}
