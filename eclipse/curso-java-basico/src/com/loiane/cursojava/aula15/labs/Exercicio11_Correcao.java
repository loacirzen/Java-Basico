package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		double salario = scan.nextDouble();
		
		int percentual = 0;
		
		if (salario <= 280.0) {
			percentual = 20;
		} else if(salario > 280.0 && salario <= 700.0){
			percentual = 15;
		} else if (salario > 700.0 && salario <= 1500.0) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		
		double aumento = (salario * percentual) / 100;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Salário: " + salario);
		System.out.println("Percentual: " + percentual);
		System.out.println("Aumento: " + aumento);
		System.out.println("Salário ajustado: " + salarioAjustado);

	}

}
