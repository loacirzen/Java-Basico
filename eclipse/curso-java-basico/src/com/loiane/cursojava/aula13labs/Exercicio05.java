package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor em metros");
		double metro = scan.nextDouble();
		System.out.println("O valor convertido para centrimetro é: " + (metro * 100));

	}

}
