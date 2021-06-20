package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor inteiro para A: ");
		int valorA = scan.nextInt();
		System.out.println("Digite o valor inteiro para B: ");
		int valorB = scan.nextInt();
		System.out.println("Digite o valor inteiro para C: ");
		int valorC = scan.nextInt();
		
		if ((valorA < valorB) && (valorA < valorC) && (valorB < valorC)){
			System.out.println(" Valores decrescente: " + valorA + " - " + valorB + " - " + valorC);
		} else if((valorB < valorA) && (valorB < valorC) && (valorA < valorC)){
			System.out.println(" Valores decrescente: " + valorB + " - " + valorA + " - " + valorC);
		} else if((valorC < valorA) && (valorC < valorB) && (valorA < valorB)){
			System.out.println(" Valores decrescente: " + valorC + " - " + valorA + " - " + valorB);
		} else if((valorB < valorA) && (valorB < valorC) && (valorC < valorA)){
			System.out.println(" Valores decrescente: " + valorB + " - " + valorC + " - " + valorA);
		} else if((valorC < valorA) && (valorC < valorB) && (valorB < valorA)){
			System.out.println(" Valores decrescente: " + valorC + " - " + valorB + " - " + valorA);	
		} else if ((valorA < valorB) && (valorA < valorC) && (valorC < valorB)){
			System.out.println(" Valores decrescente: " + valorA + " - " + valorC + " - " + valorB);
	
		}
	}
}
