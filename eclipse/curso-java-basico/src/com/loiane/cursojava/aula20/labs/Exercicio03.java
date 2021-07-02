package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int contPar = 0, contImpar = 0;
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.print("Entre com um valor para posição Matriz[" + i + "][" + j + "]: ");
				matriz[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0 ; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j] % 2 == 0) {
					contPar++;
				}else if (matriz[i][j] % 2 != 0) {
					contImpar++;
				}
			}
		}
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("A quantidade de números Par: " + contPar);
		System.out.println("A quantidade de números Impar: " + contImpar);
	}
}
