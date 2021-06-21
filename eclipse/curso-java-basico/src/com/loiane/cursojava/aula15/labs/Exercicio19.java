package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double primeiroNumero = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("Digite um das operações (A)Adiçao - (S)Subtração - (M)Multiplicação - (D)Divisão");
		String op = scan.next();
		double operacao;
		
		switch(op) {
		case "A" : operacao = primeiroNumero + segundoNumero; 
		if(operacao % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número não é par");
		}
		
		if(operacao > 0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		break;
		case "S" : operacao = primeiroNumero - segundoNumero;
		if(operacao % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número não é par");
		}
		
		if(operacao > 0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		break;
		case "M" : operacao = primeiroNumero * segundoNumero; 
		if(operacao % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número não é par");
		}
		
		if(operacao > 0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		break;
		case "D" : operacao = primeiroNumero / segundoNumero; 
		if(operacao % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número não é par");
		}
		
		if(operacao > 0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		break;
		}
		
		}
	}

