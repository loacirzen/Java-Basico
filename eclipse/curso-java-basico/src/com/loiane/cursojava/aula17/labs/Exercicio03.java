package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		double salario = 0;
		String estadoCivil = "";
		
		do {
			System.out.println("Digite seu nome: ");
			nome = scan.nextLine();
			
			if(nome.length() < 4) {
				System.out.println("Valor inválido!");
			}
		}while(nome.length() < 4);
		
		
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			if(idade < 0 || idade > 150) {
				System.out.println("Valor inválido");
			}
		}while(idade < 0 || idade > 150);
		
		
		do {
			System.out.println("Digite seu salário: ");
			 salario = scan.nextDouble();
			
			if(salario < 0) {
				System.out.println("Valor inválido");
			}
		}while(salario < 0);
		
		
		do {
			System.out.println("Digite seu estado civil: ");
			estadoCivil = scan.next();
			
			if(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
				System.out.println("Valor inválido");
			}
		}while(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d"));
	
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu salário: " + salario);
		System.out.println("Seu estado civil: " + estadoCivil);
	
	}
}