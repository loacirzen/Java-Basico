package com.loiane.cursojava.aula36.lab.Exer01;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o nome: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda();
		agenda.setNome(nome);
		
		Contato[] contatos = new Contato[3];
		for(int i = 0 ; i<contatos.length; i++) {
			System.out.println("Entre com o " + (i+1) + "º contato");
			Contato c = new Contato();
			
			System.out.println("Entre com o nome: ");
			nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Entre com o telefone: ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Entre com o email");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
			
		}
		
		agenda.setContatos(contatos);
		
		if ( agenda != null) {
			System.out.println(agenda.obterInfo());
		}
	}
}
