package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		boolean triangulo;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado A do triangulo: ");
		double ladoA = scan.nextDouble();
		System.out.println("Digite o lado B do triangulo: ");
		double ladoB = scan.nextDouble();
		System.out.println("Digite o lado C do triangulo: ");
		double ladoC = scan.nextDouble();
		
		if (((ladoA + ladoB) > ladoC) || ((ladoA + ladoC) > ladoB) || ((ladoC + ladoB) > ladoA)) {
			triangulo = true;
		} else {
			triangulo = false;
		}
		
		if (triangulo == false) {
			System.out.println("Esses valores não são de um triangulo");
		} else {
			if((ladoA == ladoB) && (ladoB == ladoC)) {
				System.out.println("Triângulo Equilátero");
			} else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoC == ladoB)) {
				System.out.println("Triângulo Isósceles");
			} else if ((ladoA != ladoB) && (ladoC != ladoB)){
				System.out.println("Triângulo Escaleno");
			}
		}

	}

}
