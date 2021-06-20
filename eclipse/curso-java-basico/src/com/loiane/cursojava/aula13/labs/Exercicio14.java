package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicio 14");
		System.out.println("Digite o tamanho do arquivo em MB");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Digite a velocidade da sua Internet");
		double velocidadeInternet = scan.nextDouble();
		double calculoTempo = tamanhoArquivo / velocidadeInternet; 
		System.out.println("O tempo estimado é de: " + calculoTempo);

	}

}
