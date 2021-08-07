package com.loiane.cursojava.aula34.lab.Exercicio02;

public class Conta {
	
	private int numero;
	private double saldo;
	private boolean statusEspecial;
	private double limite;
	
	public Conta(){
		saldo = 0;
		statusEspecial = false;
		limite = 0;
	}
	
	public Conta(int numero, double saldo, boolean statusEspecial, double limite) {
		
		this.numero = numero;
		this.saldo = saldo;
		this.statusEspecial = statusEspecial;
		this.limite = limite;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatusEspecial() {
		return statusEspecial;
	}

	public void setStatusEspecial(boolean statusEspecial) {
		this.statusEspecial = statusEspecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void saque(double saque) {
		if(saldo + limite > saque) {
			saldo -= saque;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double depositar) {
		saldo += depositar;
	}
	
	public double consultaSaldo() {
		return saldo;
	}
	
	public boolean consultaStatus() {
		return statusEspecial;
	}

}
