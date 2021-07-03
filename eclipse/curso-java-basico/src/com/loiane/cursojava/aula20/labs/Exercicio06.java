package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] jogoDaVelha = new String[3][3];
		String jogadorOne = "";
		String jogadorTwo = "";
		String jogadorDaVez = jogadorOne;
		boolean fimDePartida = false;
		boolean jogada = true;
		int linha = 0, coluna = 0;
		
		do {
			System.out.print("Jogador 1 favor informar X ou O: ");
			jogadorOne = scan.next();
			
			if(!jogadorOne.equalsIgnoreCase("X") && !jogadorOne.equalsIgnoreCase("O")){
				System.out.println("Opção valida !!!");
			}
			
			if(jogadorOne.equalsIgnoreCase("X")) {
				jogadorTwo = "O";
			}else {
				jogadorTwo = "X";
			}
			
			
		}while(!jogadorOne.equalsIgnoreCase("X") && !jogadorOne.equalsIgnoreCase("O"));
		
		jogadorDaVez = jogadorOne;
		
		do {
		
		for(int i = 0 ; i<jogoDaVelha.length; i++) {
			for(int j = 0; j<jogoDaVelha[i].length; j++) {
				if(jogoDaVelha[i][j] == null ) {
					System.out.print(" [" + i + "][" + j + "] ");
				}
				
				if(jogoDaVelha[i][j] != null) {
					System.out.print("   " + jogoDaVelha[i][j] + "    ");
				}
			}
			System.out.println();
		}
		
		do {
			jogada = true;
			
			do {
			
				System.out.println("Favor Jogador "+ jogadorDaVez + " informar uma posição ");
				System.out.print("Informe a linha: ");
				linha = scan.nextInt();
				System.out.print("Informe a coluna: ");
				coluna = scan.nextInt();
				
				if((linha < 0 || linha > 2) || (coluna < 0 || coluna > 2)) {
					System.out.println("Posição Inválida informe valores de 0 até 2");
				}	
		
			}while((linha < 0 || linha > 2) || (coluna < 0 || coluna > 2));
		
			if(jogoDaVelha[linha][coluna] == null) {
				jogoDaVelha[linha][coluna] = jogadorDaVez;
			}else {
				System.out.println("Essa posição já está ocupada");
				jogada = false;
			}
		
		}while((jogoDaVelha[linha][coluna] == null) || (linha < 0 || linha > 2) || (coluna < 0 || coluna > 2));
		
		
		for(int i = 0 ; i<jogoDaVelha.length; i++) {
			for(int j = 0; j<jogoDaVelha[i].length; j++) {
			     if ((jogoDaVelha[0][0] == jogoDaVelha[0][1]) && (jogoDaVelha[0][0] != null) && 
		                    (jogoDaVelha[0][1] == jogoDaVelha[0][2]) && (jogoDaVelha[0][2] != null)){
							fimDePartida = true;
						} else if ((jogoDaVelha[1][0] == jogoDaVelha[1][1]) && (jogoDaVelha[1][0] != null) && 
		                    (jogoDaVelha[1][1] == jogoDaVelha[1][2]) && (jogoDaVelha[1][2] != null)){
							fimDePartida = true;
						} else if ((jogoDaVelha[2][0] == jogoDaVelha[2][1]) && (jogoDaVelha[2][0] != null) && 
		                    (jogoDaVelha[2][1] == jogoDaVelha[2][2]) && (jogoDaVelha[2][2] != null)){
							fimDePartida = true;
						} else if((jogoDaVelha[0][0] == jogoDaVelha[1][0]) && (jogoDaVelha[0][0] != null) && 
		                    (jogoDaVelha[1][0] == jogoDaVelha[2][0]) && (jogoDaVelha[2][0] != null)){
							fimDePartida = true;
						} else if ((jogoDaVelha[0][1] == jogoDaVelha[1][1]) && (jogoDaVelha[0][1] != null) && 
		                    (jogoDaVelha[1][1] == jogoDaVelha[2][1]) && (jogoDaVelha[2][1] != null)){
							fimDePartida = true;
						} else if ((jogoDaVelha[0][2] == jogoDaVelha[1][2]) && (jogoDaVelha[0][2] != null) && 
		                    (jogoDaVelha[1][2] == jogoDaVelha[2][2]) && (jogoDaVelha[2][2] != null)){
							fimDePartida = true;
						} else if ((jogoDaVelha[0][0] == jogoDaVelha[1][1]) && (jogoDaVelha[0][0] != null) && 
		                    (jogoDaVelha[1][1] == jogoDaVelha[2][2]) && (jogoDaVelha[2][2] != null)){
							fimDePartida = true;
						} else if ((jogoDaVelha[0][2] == jogoDaVelha[1][1]) && (jogoDaVelha[0][2] != null) && 
		                    (jogoDaVelha[1][1] == jogoDaVelha[2][0]) && (jogoDaVelha[2][0] != null)){
							fimDePartida = true;
				} else {
					if(jogada == true) {
						if (jogadorDaVez.equalsIgnoreCase(jogadorTwo)) {
							jogadorDaVez = jogadorOne;
						} else {
							jogadorDaVez = jogadorTwo;
						}
					}else if (jogada == false) {
						jogadorDaVez = jogadorDaVez;
					}
				}
			}
		}
		
		if(fimDePartida == true) {
			System.out.print("Parabens !!! " + jogadorDaVez + " Você ganhou a partida");
		}
		
		}while(!fimDePartida);
	}
}
