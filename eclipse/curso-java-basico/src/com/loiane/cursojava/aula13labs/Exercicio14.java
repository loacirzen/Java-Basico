package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicio 14");
		System.out.println("Digite o tamanho do arquivo em MB");
		double mb = scan.nextDouble();
		System.out.println("Digite a velocidade da sua Internet");
		double velocidade = scan.nextDouble();
		double calculoTempo = ((mb * 1024) / velocidade) / 60; 
		System.out.println("O tempo estimado é de: " + calculoTempo);

	}

}
