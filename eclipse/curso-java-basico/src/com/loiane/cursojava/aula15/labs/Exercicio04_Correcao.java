package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if(letra.length() > 1) {
			System.out.println("Nâo é uma letra válida");
		} else {
			switch(letra.toUpperCase()) {
			case "A" :
			case "E" :
			case "I" :
			case "O" :
			case "U" : System.out.println("A letra digitada é uma Vogal");break;
			default : System.out.println("A letra digitada é uma Consoante");
			}
		}
	}
}
