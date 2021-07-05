package com.loiane.cursojava.aula24.labs;

public class Exercicio06_Contato {

	public static void main(String[] args) {
		Contato contato01 = new Contato();
		contato01.nome = "Pedro";
		contato01.telefone = "(41)5000-0001";
		contato01.endereco = "Endereço de Pedro";
		contato01.descricao = "Descrição de Pedro";
		
		System.out.println("Nome: " + contato01.nome);
		System.out.println("Telefone: " + contato01.telefone);
		System.out.println("Endereço: " + contato01.endereco);
		System.out.println("Descrição: " + contato01.descricao);
		System.out.println("----------------------");
		
		Contato contato02 = new Contato();
		contato02.nome = "Paulo";
		contato02.telefone = "(41)5000-0002";
		contato02.endereco = "Endereço de Paulo";
		contato02.descricao = "Descrição de Paulo";

		System.out.println("Nome: " + contato02.nome);
		System.out.println("Telefone: " + contato02.telefone);
		System.out.println("Endereço: " + contato02.endereco);
		System.out.println("Descrição: " + contato02.descricao);
		System.out.println("----------------------");
	}

}
