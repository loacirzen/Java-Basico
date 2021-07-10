package com.loiane.cursojava.aula27.lab.Exercicio01.Correcao;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.ligada = true;
		
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		

	}
}
