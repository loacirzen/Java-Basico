package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;
import java.math.*;

public class Exercicio16 {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor A: ");
		double valorA = scan.nextDouble();
		
		if (valorA == 0) {
			System.out.println("A equação não é do segundo grau ");
		} else {
			System.out.println("Digite o valor B: ");
			double valorB = scan.nextDouble();
			System.out.println("Digite o valor C: ");
			double valorC = scan.nextDouble();
			
			double delta = (Math.pow(valorB, 2)) - (4 * valorA * valorC);
			double resultaEquacao;
			
			if (delta < 0) {
				System.out.println("A equação não possui raizes reais");
			} else if (delta == 0) {
				resultaEquacao = ((-valorB)) / (2 * valorA);
				System.out.println("A equação possui apenas uma raiz real: " + resultaEquacao);
			} else {
				System.out.println("A equação possui duas raizes reais são elas: ");
				resultaEquacao = ((-valorB)) + (Math.sqrt(delta)) / (2 * valorA);
				System.out.println("Valor de x' : " + resultaEquacao);
				resultaEquacao = ((-valorB)) - (Math.sqrt(delta)) / (2 * valorA);
				System.out.println("Valor de x'' : " + resultaEquacao);
			}
			
		}

	}

}
