package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;
		do {
			System.out.println("Entre com a população: A ");
			popA = scan.nextDouble();
			
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("População tem que ser maior que ");
			}
			
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a população: B ");
			popB = scan.nextDouble();
			
			if(popB > 0) {
				valido = true;
			} else {
				System.out.println("População tem que ser maior que ");
			}
			
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da população A ");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento tem que maior que 0");
			}
			
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da população de B");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento tem que ser maior que 0");
			}
			
		}while(!valido);
	
	
		int cont = 0;
		
		while(popA < popB ) {
			
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont++;
			
		}	
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de anos: " + cont);

	}

}
