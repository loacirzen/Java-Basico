package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota parcial: ");
		double notaPrimeiro = scan.nextDouble();
		System.out.println("Digite a segunda nota parcial: ");
		double notaSegundo = scan.nextDouble();
		
		double mediaNotas = (notaPrimeiro + notaSegundo) / 2;
		
		String conceito;
		if (mediaNotas > 9.0) {
			conceito = "A";
		} else if (mediaNotas > 7.5 && mediaNotas <= 9.0) {
			conceito = "B";
		} else if (mediaNotas > 6.0 && mediaNotas <= 7.5) {
			conceito = "C";
		} else if (mediaNotas > 4.0 && mediaNotas <= 6.0) {
			conceito = "D";
		} else {
			conceito = "E";
		}
		
		
		System.out.println("Primeira parcial: " + notaPrimeiro);
		System.out.println("Segunda parcial: " + notaSegundo);
		System.out.println("Sua média foi: " + mediaNotas);
		System.out.println("Seu conceito foi: " + conceito);
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println("APROVADO"); break;
		case "D":
		case "E": System.out.println("REPROVADO"); break; 
		}

	}

}
