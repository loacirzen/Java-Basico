package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		String situacao = "";
		
		for(int i = 0; i<nota1.length; i++) {
			System.out.print("1° Bimestre - Digite a nota do " + i + "° aluno: ");
			nota1[i] = scan.nextDouble();
		}
		
		for(int j = 0; j<nota2.length; j++) {
			System.out.print("2° Bimestre - Digite a nota do " + j + "° aluno: ");
			nota2[j] = scan.nextDouble();
		}
		
		for(int x = 0; x<result.length; x++) {
			result[x] = (nota1[x] + nota2[x]) / 2;
		}
		
		for(int y = 0; y<result.length; y++) {
			if(result[y] >= 7 && result[y] <= 9.9) {
				situacao = "Aprovado";
			} else if (result[y] < 7) {
				situacao = "Reprovado";
			} else if (result[y] == 10) {
				situacao = "Aprovado com Distinção";
			}
			System.out.println("A média do " + y + "° aluno: " + result[y] + " - " + situacao);
		}
	}
}
