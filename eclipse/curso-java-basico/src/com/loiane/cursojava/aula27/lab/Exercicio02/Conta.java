package com.loiane.cursojava.aula27.lab.Exercicio02;

public class Conta {
	
	int numero;
	double saldo;
	boolean contaEspecial;
	double limite;

	double saque(double quantia) {
		if(saldo < quantia) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo = saldo - quantia;	
		}
		return saldo;
	}
	
	double depositar(double quantia) {
		return saldo = saldo + quantia;
	}
	
	double retornaSaldo() {
		return saldo;
	}
	
	boolean chequeEspecial() {
		return contaEspecial;
	}
}
