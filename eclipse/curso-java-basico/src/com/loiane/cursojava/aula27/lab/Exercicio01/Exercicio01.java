package com.loiane.cursojava.aula27.lab.Exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		boolean status = lampada.ligarLampada();
		System.out.println(status);
		
		
		status = lampada.desligarLampada();
		System.out.println(status);

	}

}
