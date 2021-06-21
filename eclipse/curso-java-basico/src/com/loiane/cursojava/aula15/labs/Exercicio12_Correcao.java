package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor/hora");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com as horas trabalhada no mês: ");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = (valorHora * qtdHoras);
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900.0 && salarioBruto <= 1500.0) {
			percentualIR = 5;
		} else if (salarioBruto > 1500.0 && salarioBruto <= 2500.0) {
			percentualIR = 10;
		} else if (salarioBruto > 2500.0) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("Salário Bruto: ( " + valorHora + " * " + qtdHoras + " ) :R$ " + salarioBruto);
		System.out.println("(-) IR " + percentualIR + "%                      :R$ " + ir);
		System.out.println("(-) INSS 10%                    :R$ " + inss);
		System.out.println("FGTS 11%                        :R$ " + fgts);
		System.out.println("Total de descontos:             :R$ " + totalDescontos);
		System.out.println("Salário Líquido:                :R$ " + salarioLiquido);
		
		

	}

}
