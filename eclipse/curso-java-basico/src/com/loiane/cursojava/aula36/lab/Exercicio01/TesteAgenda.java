package com.loiane.cursojava.aula36.lab.Exercicio01;

import com.loiane.cursojava.aula36.Telefone;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		agenda.setNome("Minha Agenda Teste One");
		
		Contato contato1 = new Contato();
		contato1.setNome("Loacir");
		contato1.setEmail("loacirzen@gmail.com");
		
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setNumero("1234-5678");
		telefone.setDdd("41");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setNumero("8765-4321");
		telefone2.setDdd("41");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		Contato[] contatos = new Contato[1];
		contatos[0] = contato1;
		
		agenda.setContatos(contatos);
		
		System.out.println(contato1.getNome());
	
		
	}

}
