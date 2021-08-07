package com.loiane.cursojava.aula35.lab.Exercicio01;

public class TesteContador {

	public static void main(String[] args) {
		System.out.println(Contador.retornaContador());
		Contador contOne = new Contador();
		System.out.println(Contador.retornaContador());
		Contador contTwo = new Contador();
		System.out.println(Contador.retornaContador());
		Contador contTree = new Contador();
		System.out.println(Contador.retornaContador());
		Contador.zerarContador();
		System.out.println(Contador.retornaContador());
		

	}

}
