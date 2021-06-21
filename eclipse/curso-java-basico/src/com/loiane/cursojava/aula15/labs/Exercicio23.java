package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite qual é a carne (F)File Duplo - (A)Alcatra - (P)Picanha ");
		String tipoCarne = scan.nextLine();
		
		System.out.println("Digite o peso da carne (Kg): ");
		double pesoCarne = scan.nextDouble();

		System.out.println("Digite o tipo de pagamento (C)Cartão ou (D)Dinheiro: ");
		String formaPagamento = scan.next();

		
		double tabelaPreco = 0;
		
		if(pesoCarne <= 5) {
			if (tipoCarne.toUpperCase().equals("F")) {
				tabelaPreco = 4.90;
			}else if (tipoCarne.toUpperCase().equals("A")) {
				tabelaPreco = 5.90;
			} else {
				tabelaPreco = 6.90;
			}
		} else if (pesoCarne > 5) {
			if (tipoCarne.toUpperCase().equals("F")) {
				tabelaPreco = 5.80;
			}else if (tipoCarne.toUpperCase().equals("A")) {
				tabelaPreco = 6.80;
			} else {
				tabelaPreco = 7.80;
			} 
		}
		
		double valorPrecoTotal = tabelaPreco * pesoCarne;
		double valorDesconto;
			if (formaPagamento.toUpperCase().equals("C")) {
				valorDesconto = (valorPrecoTotal * 5) / 100; 
			}else {
				valorDesconto = 0;
			}
				
		double valorAPagar = valorPrecoTotal - 	valorDesconto;
		
		System.out.println("Tipo de carne:              " + tipoCarne);
		System.out.println("Quantidade de carne (Kg):   " + pesoCarne);
		System.out.println("Preço total:                " + valorPrecoTotal);
		System.out.println("Tipo de pagamento:          " + formaPagamento);
		System.out.println("Valor do desconto:          " + valorDesconto);
		System.out.println("Valor a pagar:              " + valorAPagar);
	}

}
