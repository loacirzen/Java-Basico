package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a nota do primeiro semestre: ");
		double notaPrimeiroSemestre = scan.nextDouble();
		System.out.println("Digite a nota do segundo semestre: ");
		double notaSegundoSemestre = scan.nextDouble();
		
		double mediaNotas = (notaPrimeiroSemestre + notaSegundoSemestre) / 2;
		
		if (mediaNotas >= 7 && mediaNotas < 10) {
			System.out.println("Aprovado");
		}else if (mediaNotas < 7){
			System.out.println("Reprovado");
		}else if (mediaNotas == 10) {
			System.out.println("Aprovado com Distinção");
		}
	}

}
