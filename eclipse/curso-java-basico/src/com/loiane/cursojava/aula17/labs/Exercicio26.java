package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Fatorial de: ");
		int nFat = scan.nextInt();
	    int fatorial = nFat;
		int cont = nFat;
		for (int i = nFat ; i > 1 ; i--) {
			if(cont == nFat) {
				System.out.print(cont + "! = " + cont);
			}else {
				System.out.print(" . " + cont);
			}
			cont = i - 1;
			fatorial = fatorial * cont;		
		}
		System.out.println(" = " + fatorial);
	}

}
