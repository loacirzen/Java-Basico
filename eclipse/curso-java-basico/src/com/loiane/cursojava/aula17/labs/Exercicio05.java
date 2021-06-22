package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int cont = 0;
		int paisA = 0;
		int paisB = 0;
		double taxaPaisA = 0;
		double taxaPaisB = 0;
		boolean flag = false;
		// 80000 (3), paisB = 200000 (1.5)
		//
		
		Scanner scan = new Scanner(System.in);
		do {
			do {
				System.out.println("Entre com a população do País A");
				paisA = scan.nextInt();
			} while(paisA < 0);
			
			System.out.println("Informe a taxa do País A");
			taxaPaisA = scan.nextDouble();
			
			do {
				System.out.println("Entre com a população do País B");
				paisB = scan.nextInt();
			} while (paisB < 0);
			
			System.out.println("Informe a taxa do País B");
			taxaPaisB = scan.nextDouble();
			
			for( ; paisA <= paisB; paisA += (paisA/100) * taxaPaisA, paisB += (paisB/100) * taxaPaisB ) {
				cont++;
			}
			 	
			System.out.println("Quantidade de anos necessário é de: " + cont);
			System.out.println("Deseja executar o programa novamente (S)Sim ou (N)Não");
			String op = scan.next();
			
			do {
				if(op.equalsIgnoreCase("S")) {
					flag = true;
				} else if (op.equalsIgnoreCase("N")) {
					flag = false;
					System.out.println("Encerrando o programa");
				} else {
					System.out.println("Opção inválida");
				}
			}while(!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));
		
		} while (flag);
	}
}
