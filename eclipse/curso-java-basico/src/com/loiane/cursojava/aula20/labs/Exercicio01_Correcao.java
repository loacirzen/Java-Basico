package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio01_Correcao {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int [4][4];
		
		Random numeroRandom = new Random();
		
		for(int i = 0 ;i<numerosAleatorios.length; i++) {
			for(int j = 0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int linha = 0;
		int col = 0;
		
		for(int i = 0 ;i<numerosAleatorios.length; i++) {
			for(int j = 0; j<numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		for(int i = 0 ;i<numerosAleatorios.length; i++) {
			for(int j = 0; j<numerosAleatorios[i].length; j++) {
				System.out.print("  " + numerosAleatorios[i][j] + "  ");
			}
			System.out.println("");
		}
		
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);
		
	}
}
