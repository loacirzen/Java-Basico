package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor para o produto A");
		double produtoA = scan.nextDouble();
		System.out.println("Digite o valor para o produto B");
		double produtoB = scan.nextDouble();
		System.out.println("Digite o valor para o produto C");
		double produtoC = scan.nextDouble();
		
		if ((produtoA < produtoB) && (produtoA < produtoC)){
			System.out.println("O produto a ser comprado é o A pois possui o valor de: " + produtoA);
		} else if ((produtoB < produtoA) && (produtoB < produtoC)){
			System.out.println("O produto a ser comprado é o B pois possui o valor de: " + produtoB);
		}else {
			System.out.println("O produto a ser comprado é o C pois possui o valor de: " + produtoC);
		}	
		

	}

}
