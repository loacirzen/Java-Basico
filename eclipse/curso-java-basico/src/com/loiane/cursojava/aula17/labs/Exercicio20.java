package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a qtd de pessoas: ");
		int qtdPessoas = scan.nextInt();
		int cont = qtdPessoas;
		int somaIdade = 0;
		
		while(cont > 0) {
			System.out.println("Digite a idade: ");
			int idade = scan.nextInt();
			somaIdade = somaIdade + idade;
			cont--;
		}
		
		double mediaIdade = (somaIdade / qtdPessoas);
		
		if((mediaIdade > 0) && (mediaIdade <= 25)) {
			System.out.println("A turma é jovem");
		} else if ((mediaIdade > 25) && (mediaIdade <= 60)) {
			System.out.println("A turma é adulta");
		} else if (mediaIdade > 60) {
			System.out.println("A turma é idosa");
		}
	}
}
