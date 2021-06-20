package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor (F) - Feminino ou (M) - Masculino: ");
		String sexo = scan.nextLine();
		
		switch(sexo) {
		case "F" : System.out.println("Feminino"); break;
		case "M" : System.out.println("Masculino");break;
		default : System.out.println("Sexo inválido");
		}

	}

}
