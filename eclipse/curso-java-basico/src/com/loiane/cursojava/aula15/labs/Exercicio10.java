package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite (M)-Matutino, (V)-Vespertino ou (N)-Noturno");
		String periodoDia = scan.next();
		
		switch(periodoDia) {
		case "M" : System.out.println("Bom dia");break;
		case "V" : System.out.println("Boa tarde");break;
		case "N" : System.out.println("Boa noite");break;
		default : System.out.println("Valor inválido");
		}

	}

}
