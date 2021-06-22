package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a qtd de turmas");
		int qtdTurma = scan.nextInt();
		int qtdAluno;
		int somaAluno = 0;
		int cont = qtdTurma;
		
		while(cont > 0) {
			do {
				System.out.println("Digite a qtd de turmas");
				qtdAluno = scan.nextInt();
				if(qtdAluno > 40) {
					System.out.println("Qtd acima de 40");
				}
			}while(qtdAluno > 40);
			cont--;
			somaAluno = somaAluno + qtdAluno;
		}
		
		double mediaQtdAuno = somaAluno / qtdTurma;
		System.out.println("A media de alunos é de: " + mediaQtdAuno);
	}
}
