package com.loiane.cursojava.aula27.lab.Exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.numero = 102040;
		conta.saldo = 1000.0;
		conta.contaEspecial = false;
		conta.limite = 0;
		
		System.out.println("Efetuando saque de 550");
		double saldoAtual = conta.saque(550);
		System.out.println("Seu saldo atual é: " + saldoAtual);
		
		System.out.println("Efetuando deposito de 230");
		saldoAtual = conta.depositar(230.0);
		System.out.println("Seu saldo atual é: " + saldoAtual);
		
		System.out.println("Seu saldo é: " + conta.retornaSaldo());
		System.out.println("Sua conta é especial: " + conta.chequeEspecial());

	}

}
