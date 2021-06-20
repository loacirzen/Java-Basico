package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome: " + primeiroNome);
		*/
		
		/*
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		*/
		
		/*
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		*/
		
		System.out.println("Digite seu primeiro nome, idade, altura");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		System.out.println("Seus dados foram: ");
		System.out.println("Seu primeiro nome: " + primeiroNome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Sua altura: " + altura);
		

	}

}
