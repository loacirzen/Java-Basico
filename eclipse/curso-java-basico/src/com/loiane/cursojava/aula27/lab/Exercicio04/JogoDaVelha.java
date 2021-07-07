package com.loiane.cursojava.aula27.lab.Exercicio04;

import java.util.Scanner;

public class JogoDaVelha {
	
	Scanner scan = new Scanner(System.in);
	String[][] jogoDaVelha;
	String jogadorOne;
	String jogadorTwo;
	String jogadorDaVez;
	boolean fimDePartida;
	boolean jogada;
	int linha, coluna;
	
	void entrarComJogador () {
		System.out.print("Jogador 1 favor informar X ou O: ");
		jogadorOne = scan.next();
		verificarJogadorValido(jogadorOne);
	}
	
	void verificarJogadorValido(String jogador) {
		if(!jogador.equalsIgnoreCase("X") && !jogador.equalsIgnoreCase("O")){
			System.out.println("Opção invalida !!!");
			entrarComJogador();
		}
		if(jogador.equalsIgnoreCase("X")) {
			jogadorTwo = "O";
		}else {
			jogadorTwo = "X";
		}
		jogadorDaVez = jogadorOne;
	}
	
	void montarMatriz() {
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
	}
	
	void iniciarJogada() {
		montarMatriz();
		verificaJogadaMatriz();
		verificarPosicaoOcupada();	
		verificarJogada();
		verificarFimDePartida();
			
	}
	
	
	void verificaJogadaMatriz() {
		jogada = true;
		System.out.println("Favor Jogador "+ jogadorDaVez + " informar uma posição ");
		System.out.print("Informe a linha: ");
		linha = scan.nextInt();
		System.out.print("Informe a coluna: ");
		coluna = scan.nextInt();
		
		if((linha < 0 || linha > 2) || (coluna < 0 || coluna > 2)) {
			System.out.println("Posição Inválida informe valores de 0 até 2");
			jogada = false;
			verificaJogadaMatriz();
		}
	}
	
	
	void verificarPosicaoOcupada() {
		if(jogoDaVelha[linha][coluna] == null) {
			jogoDaVelha[linha][coluna] = jogadorDaVez;
		}else {
			System.out.println("Essa posição já está ocupada");
			verificaJogadaMatriz();
			verificarPosicaoOcupada();
		}
		
	}
	
	boolean verificarJogada() {
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
						}
					}
			} 	
		return fimDePartida;
	}
	
	void trocarJogador() {
		if (jogadorDaVez.equalsIgnoreCase(jogadorTwo)) {
			jogadorDaVez = jogadorOne;
		} else {
			jogadorDaVez = jogadorTwo;
		}
	}
	
	void verificarFimDePartida(){
		if(fimDePartida == true) {
			System.out.print("Parabens !!! " + jogadorDaVez + " Você ganhou a partida");
		}else {
			trocarJogador();
			iniciarJogada();
		}
	}
}
