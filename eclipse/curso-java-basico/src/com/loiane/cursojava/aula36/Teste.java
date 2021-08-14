package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		
		
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		//criar o objeto endereço
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of thrones");
		end.setNumero("n/a");
		end.setComplemento(" - ");
		end.setCidade("Kings Landings");
		end.setCidade("Westeros");
		end.setCep("123456789");
		
		
		contato.setEndereco(end);
		
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
		
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getNomeRua());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getNumero());
		}*/
		
		/*if(contato != null && contato.getTelefones() != null) {
			for(int i = 0; i<contato.getTelefones().length; i++) {
				System.out.println(contato.getTelefones()[i].getDdd() + " " + contato.getTelefones()[i].getNumero());
			}
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}
}
