package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean infoValida = false;
		
		String nome = "";
		int idade = 0;
		double salario = 0;
		String genero = "";
		String estadoCivil = "";
		
		do {
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("O Nome precisa de no mínimo 3 caracteres");
			}
			
		}while(!infoValida);

		
		infoValida = false;
		
		do {
			System.out.println("Entre com a idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			}else {
				System.out.println("Idade precisa se maior que 0 e menor que 150");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com o salário: ");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				infoValida = true;
			}else {
				System.out.println("O salário precisa ser maior que 0");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com o sexo: ");
			genero = scan.next();
			
			if(genero.equalsIgnoreCase("f") ||
					genero.equalsIgnoreCase("m")) {
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm'.");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com estado civil: ");
			 estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") ||
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("d") ||
					estadoCivil.equalsIgnoreCase("v")) {
				infoValida = true;
			}else {
				System.out.println("Estado Civil precisa ser 's' , 'c' , 'd' ou 'v'.");
			}
			 
		}while(!infoValida);
		
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu salário: " + salario);
		System.out.println("Seu genero: " + genero);
		System.out.println("Seu estado civil: " + estadoCivil);
	
	}
}
