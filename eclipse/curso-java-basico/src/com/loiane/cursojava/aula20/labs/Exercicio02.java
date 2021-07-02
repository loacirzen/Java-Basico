package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		int maiorValor = -20;
		int menorValor = 20;
		int maiorLinhaCinco = -20, menorLinhaCinco = 20;
		int maiorColunaSete = -20, menorColunaSete = 20;
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = new Random().nextInt(10);
			}
		}
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
				}
				
				if(matriz[i][j] < menorValor) {
					menorValor = matriz[i][j];
				}
			}
		}
		
		for(int j = 0; j<10; j++) {
			if(matriz[5][j] > maiorLinhaCinco) {
				maiorLinhaCinco = matriz[5][j];
			}
			
			if(matriz[5][j] < menorLinhaCinco) {
				menorLinhaCinco = matriz[5][j];
			}
			
		}
		
		for(int i = 0; i<10; i++) {
			if(matriz[i][7] > maiorColunaSete) {
				maiorColunaSete = matriz[i][7];
			}
			
			if(matriz[i][7] < menorColunaSete) {
				menorColunaSete = matriz[i][7];
			}
			
		}
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println(" ");
		}
		
		System.out.println("O maior elemento da Matriz é : " + maiorValor);
		System.out.println("O menor elemento da Matriz é : " + menorValor);
		System.out.println("O maior elemento na linha 5  : " + maiorLinhaCinco);
		System.out.println("O menor elemento na linha 5  : " + menorLinhaCinco);
		System.out.println("O maior elemento na coluna 7 : " + maiorColunaSete);
		System.out.println("O menor elemento na coluna 7 : " + menorColunaSete);
	}
}

