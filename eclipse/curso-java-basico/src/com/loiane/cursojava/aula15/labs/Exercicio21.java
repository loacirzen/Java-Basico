package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tipo de combustível (A)Álcoll ou (G)Gasolina:");
		String combustivel = scan.nextLine();
		System.out.println("Informe a quantidade de litros que vocês deseja: ");
		double litros = scan.nextDouble();
		double desconto = 0; 
		double precoLitro = 0;
		
		if(combustivel.toUpperCase().equals("A")) {
			precoLitro = 1.90;
			if (litros <= 20) {
				desconto = 3;
			} else if (litros > 20) {
				desconto = 5;
			}
		} else if(combustivel.toUpperCase().equals("G")) {
			precoLitro = 2.50;
			if (litros <= 20) {
				desconto = 4;
			} else if (litros > 20) {
				desconto = 6;
			}
		}else {
			System.out.println("Valor incorreto");
		}
		
		double calculoCombustivel = (precoLitro * litros) - (precoLitro * litros) * desconto / 100; 
		System.out.println("O valor total é: " + (precoLitro * litros));
		System.out.println("Seu disconto foi de: " + (precoLitro * litros) * desconto / 100);
		System.out.println("O valor a ser pago é: " + calculoCombustivel);
	}

}
