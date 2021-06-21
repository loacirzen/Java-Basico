package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de Morango em (Kg): ");
		double qtdPesoMorango = scan.nextDouble();
		System.out.println("Digite a quantidade de Maça em (Kg):");
		double qtdPesoMaca = scan.nextDouble();
		
		double tabelaPrecoMorango = 0;
		double tabelaPrecoMaca = 0;
		
		if(qtdPesoMorango <= 5) {
			tabelaPrecoMorango = 2.50;
		} else if(qtdPesoMorango > 5) {
			tabelaPrecoMorango = 2.20;
		}
		
		if(qtdPesoMaca <= 5) {
			tabelaPrecoMaca = 1.80;
		} else if(qtdPesoMaca > 5) {
			tabelaPrecoMaca = 1.50;
		}
		
		double totalPeso = qtdPesoMorango + qtdPesoMaca;
		double totalPrecoMorango = qtdPesoMorango * tabelaPrecoMorango;
		double totalPrecoMaca = qtdPesoMaca * tabelaPrecoMaca;
		double totalPrecoFrutas = totalPrecoMorango +  totalPrecoMaca;
		
		if ((totalPeso > 8) || (totalPrecoFrutas > 25)) {
			totalPrecoFrutas = totalPrecoFrutas - (totalPrecoFrutas * 10) / 100; 
		} else {
			totalPrecoFrutas = totalPrecoFrutas;
		}
		
		System.out.println("O valor a ser pago é de: " + totalPrecoFrutas);

	}

}
