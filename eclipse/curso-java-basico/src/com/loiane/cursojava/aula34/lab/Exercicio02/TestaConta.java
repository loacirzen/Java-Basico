package com.loiane.cursojava.aula34.lab.Exercicio02;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.consultaSaldo());
		conta.depositar(200.0);
		System.out.println(conta.consultaSaldo());
		conta.saque(150.0);
		System.out.println(conta.consultaSaldo());

	}

}
