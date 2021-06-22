package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com N fatorial: ");
		int nFat = scan.nextInt();
	    int fatorial = nFat;
		int cont;
		for (int i = nFat ; i > 1 ; i--) {
			cont = i - 1;
			fatorial = fatorial * cont;		
		}
		System.out.println(fatorial);
	}
}
