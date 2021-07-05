package com.loiane.cursojava.aula24.labs;

public class Exercicio05_Conta {

	public static void main(String[] args) {
		
		Conta conta01 = new Conta();
		conta01.numero = 12345678;
		conta01.saldo = 500.0;
		conta01.statusEspecial = false;
		conta01.limite = 200.0;
		
		System.out.println("Numero: " + conta01.numero);
		System.out.println("Saldo: " + conta01.saldo);
		System.out.println("Status Especial: " + conta01.statusEspecial);
		System.out.println("Limite: " + conta01.limite);
		
		System.out.println("------------------------");

		Conta conta02 = new Conta();
		conta02.numero = 12341234;
		conta02.saldo = 1000.0;
		conta02.statusEspecial = false;
		conta02.limite = 0.0;
		
		System.out.println("Numero: " + conta02.numero);
		System.out.println("Saldo: " + conta02.saldo);
		System.out.println("Status Especial: " + conta02.statusEspecial);
		System.out.println("Limite: " + conta02.limite);
		
		System.out.println("------------------------");
		
		Conta conta03 = new Conta();
		conta03.numero = 43214321;
		conta03.saldo = 73.52;
		conta03.statusEspecial = true;
		conta03.limite = 1000.0;
		
		System.out.println("Numero: " + conta03.numero);
		System.out.println("Saldo: " + conta03.saldo);
		System.out.println("Status Especial: " + conta03.statusEspecial);
		System.out.println("Limite: " + conta03.limite);
		
		System.out.println("------------------------");
		
		
	}

}
