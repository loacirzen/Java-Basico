package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora");
		double valorHora = scan.nextDouble();
		System.out.println("Digite quantidade de horas trabalhada no mês: ");
		double totalHoras = scan.nextDouble();
		
		double salarioBruto = (valorHora * totalHoras);
		
		double descontoSindicato = (salarioBruto * 3) / 100;
		double descontoINSS = (salarioBruto * 10) / 100;
		double FGTS = (salarioBruto * 11) / 100;
		
		int taxaIR = 0;
		
		if(salarioBruto > 900.0 && salarioBruto <= 1500.0) {
			taxaIR = 5;
		}else if (salarioBruto > 1500.0 && salarioBruto <= 2500.0) {
			taxaIR = 10;
		}else if (salarioBruto > 2500.0) {
			taxaIR = 20;
		}
		
		double descontoIR = (salarioBruto * taxaIR) / 100;
		double tatalDesconto =  descontoINSS + descontoIR;
		double salarioLiquido = salarioBruto - tatalDesconto;
		
		System.out.println("Salário Bruto: " + valorHora + " " + totalHoras + " : " + salarioBruto);
		System.out.println("(-) IR " + taxaIR + "% :                  " + descontoIR);
		System.out.println("(-) INSS 10%                " + descontoINSS);
		System.out.println("FGTS 11%                    " + FGTS);
		System.out.println("Total de descontos:         " + tatalDesconto);
		System.out.println("Salário Líquido:            " + salarioLiquido);
		
		
	}

}
