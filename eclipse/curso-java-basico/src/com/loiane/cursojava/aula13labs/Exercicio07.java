package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		System.out.println("Exercicio 07");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		System.out.println("Digite a base: ");
		double base = scan.nextDouble();
		double areaQuadrado = altura * base;
		System.out.println("A área do quadrado é : " + areaQuadrado + " O dobro é : " + (areaQuadrado * 2));

	}

}
