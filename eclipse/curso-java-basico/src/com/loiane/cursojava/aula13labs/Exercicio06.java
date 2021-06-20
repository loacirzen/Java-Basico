package com.loiane.cursojava.aula13labs;

import java.util.Scanner;
import java.math.*;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Exercicio 06");
		System.out.println("Digite o raio de um circulo: ");
		double raio = scan.nextDouble();
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do circulo é: " + areaCirculo);

	}

}
