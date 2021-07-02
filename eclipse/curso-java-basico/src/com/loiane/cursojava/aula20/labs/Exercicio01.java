package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int maiorValor = -20000;
		int posI = -10, posJ = -10;
		int valorInformado = 0;
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				
				do {
					System.out.print("Entre com um valor para o elemento matriz[" + i + "][" + j + "]: ");
					valorInformado = scan.nextInt();
					if(valorInformado < 0 || valorInformado > 9) {
						System.out.println("Valor deve ser entre 0 até 9");
					}else {
						matriz[i][j] = valorInformado;
					}
					
				}while(valorInformado < 0 || valorInformado > 9);
			}
		}
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					posI = i;
					posJ = j;
				}
			}
		}
		
		System.out.println("O maior elemento da Matriz é: " + maiorValor);
		System.out.println("Na posição Matriz[" + posI + "][" + posJ + "]");
	}
}
