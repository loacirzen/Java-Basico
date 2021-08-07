package com.loiane.cursojava.aula35.lab.Exercicio01;

public class Contador {
	
	static int cont = 0;
	
	public Contador() {
		incrementarContador();
	}
	
	public static void incrementarContador() {
		cont += 1;
	}
	
	public static void zerarContador() {
		cont = 0;
	}
	
	public static int retornaContador() {
		return cont;
	}
	
	

}
