package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		String senha;
		
		do {
		System.out.println("Entre com seu nome: ");
		nome = scan.nextLine();
		System.out.println("Entre com sua senha: ");
		senha = scan.nextLine();
			if(nome.equals(senha)) {
				System.out.println("ERRO! nome e senha são iguais");
			}
		
		}while(nome.equals(senha));
		
		System.out.println("OK! ");
	}
}
