package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio05_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a nota do primeiro semestre: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a nota do segundo semestre: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if  (media == 10){
			System.out.println("Aprovado");
		}else if (media >= 7 && media < 10) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado com Distinção");
		}

	}

}
