package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		switch(letra) {
		case "A" :
		case "E" :
		case "I" :
		case "O" :
		case "U" :	
		case "a" :
		case "e" :
		case "i" :
		case "o" :
		case "u" : System.out.println("A letra digitada é uma Vogal");break;
		default : System.out.println("A letra digitada é uma Consoante");
		}

	}

}
