package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int maiorNumero;
		int menorNumero;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor inteiro para A: ");
		int valorA = scan.nextInt();
		System.out.println("Digite o valor inteiro para B: ");
		int valorB = scan.nextInt();
		System.out.println("Digite o valor inteiro para C: ");
		int valorC = scan.nextInt();
		
		if ((valorA > valorB) && (valorA > valorC)){
			maiorNumero = valorA;
		} else if ((valorB > valorA) && (valorB > valorC)){
			maiorNumero = valorB;
		}else {
			maiorNumero = valorC;
		}		
		
		if ((valorA < valorB) && (valorA < valorC)){
			menorNumero = valorA;
		} else if ((valorB < valorA) && (valorB < valorC)){
		    menorNumero = valorB;
		}else {
			menorNumero = valorC;
		}	

		System.out.println("O maior número é: " + maiorNumero);
		System.out.println("O menor número é: " + menorNumero);

	}

}
