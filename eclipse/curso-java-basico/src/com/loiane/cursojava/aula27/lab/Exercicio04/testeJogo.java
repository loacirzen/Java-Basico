package com.loiane.cursojava.aula27.lab.Exercicio04;

public class testeJogo {

	public static void main(String[] args) {
		
		JogoDaVelha jogar = new JogoDaVelha();
		jogar.jogoDaVelha = new String[3][3];
		jogar.jogadorOne = "";
		jogar.jogadorTwo = "";
		jogar.jogadorDaVez = jogar.jogadorOne;
		jogar.fimDePartida = false;
		jogar.jogada = true;
		jogar.linha = 0;
		jogar.coluna = 0;
		
		jogar.entrarComJogador();
		jogar.iniciarJogada();
		
	}

}
