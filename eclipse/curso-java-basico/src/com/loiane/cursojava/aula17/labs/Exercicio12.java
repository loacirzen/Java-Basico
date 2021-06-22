package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre um número");
		int tabuada = scan.nextInt();
		
		for(int i = 0 ; i < 11 ; i++) {
			int resultado = i*tabuada;
			System.out.println(tabuada + " X " + i + " = " + resultado);
		}
	}
}
