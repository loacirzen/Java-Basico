package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o ano atual: ");
		int anoAtual = scan.nextInt();
		
		System.out.print("Informe o salario inicial: ");
		double salarioInicial = scan.nextDouble();
		
		int anoInicial = 1996;
		double taxaAumento = 1.5;
		double salarioAtual = salarioInicial;
		
		do {
			salarioAtual = salarioAtual + (salarioAtual * taxaAumento) / 100;
			taxaAumento = (taxaAumento * 2);
			anoInicial ++;
			
		}while(anoInicial < anoAtual);
		
		System.out.print("O salário atual é: " + salarioAtual);
	}

}
