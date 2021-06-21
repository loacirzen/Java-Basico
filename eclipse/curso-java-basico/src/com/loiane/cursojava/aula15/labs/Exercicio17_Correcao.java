package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio17_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("O ano é bissexto");
		}else {
			System.out.println("O ano não é bissexto");
		}

	}

}
