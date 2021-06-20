package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int taxaAumento;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhada no mês: ");
		double totalHoras = scan.nextDouble();
		
		double salarioAtual = (valorHora * totalHoras);
		
		if (salarioAtual <= 280.0) {
			taxaAumento = 20;
		} else if(salarioAtual > 280.0 && salarioAtual <= 700.0){
			taxaAumento = 15;
		} else if (salarioAtual > 700.0 && salarioAtual <= 1500.0) {
			taxaAumento = 10;
		} else {
			taxaAumento = 5;
		}
		
		double valorAumento = (salarioAtual * taxaAumento) / 100;
		double salarioRejuste = salarioAtual + valorAumento;
		
		System.out.println("O salário antes do reajuste: " + salarioAtual);
		System.out.println("O percentual de aumento aplicado: " + taxaAumento);
		System.out.println("O valor do aumento: " + valorAumento);
		System.out.println("o novo salário, após o aumento: " + salarioRejuste);
		
	}

}
