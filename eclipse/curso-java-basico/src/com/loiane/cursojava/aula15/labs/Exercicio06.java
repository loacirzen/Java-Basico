package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor inteiro para A: ");
		int valorA = scan.nextInt();
		System.out.println("Digite o valor inteiro para B: ");
		int valorB = scan.nextInt();
		System.out.println("Digite o valor inteiro para C: ");
		int valorC = scan.nextInt();
		
		if ((valorA > valorB) && (valorA > valorC)){
			System.out.println("O maior numero foi: " + valorA);
		} else if ((valorB > valorA) && (valorB > valorC)){
			System.out.println("O maior numero foi: " + valorB);
		}else {
			System.out.println("O maior numero foi: " + valorC);
		}	

	}

}
