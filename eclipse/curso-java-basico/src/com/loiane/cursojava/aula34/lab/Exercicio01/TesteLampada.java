package com.loiane.cursojava.aula34.lab.Exercicio01;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.ligarLampada();
		System.out.println(lampada.retornarEstado());
		lampada.alterarEstado();
		System.out.println(lampada.retornarEstado());
		
		

	}

}
