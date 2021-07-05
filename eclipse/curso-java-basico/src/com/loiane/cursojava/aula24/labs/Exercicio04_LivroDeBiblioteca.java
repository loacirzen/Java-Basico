package com.loiane.cursojava.aula24.labs;

public class Exercicio04_LivroDeBiblioteca {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livroBiblioteca01 = new LivroDeBiblioteca();
		livroBiblioteca01.id = 1000;
		livroBiblioteca01.statusEmprestimo = true;
		livroBiblioteca01.ISBN = 85797100490L;
		
		System.out.println("Id: " + livroBiblioteca01.id);
		System.out.println("Status Emprestimo: " + livroBiblioteca01.statusEmprestimo);
		System.out.println("ISBN: " + livroBiblioteca01.ISBN);
		
		System.out.println("------------------------------");
		
		
		LivroDeBiblioteca livroBiblioteca02 = new LivroDeBiblioteca();
		livroBiblioteca02.id = 1001;
		livroBiblioteca02.statusEmprestimo = false;
		livroBiblioteca02.ISBN = 8506067421L;
		
		System.out.println("Id: " + livroBiblioteca02.id);
		System.out.println("Status Emprestimo: " + livroBiblioteca02.statusEmprestimo);
		System.out.println("ISBN: " + livroBiblioteca02.ISBN);
		
		System.out.println("------------------------------");
		
		LivroDeBiblioteca livroBiblioteca03 = new LivroDeBiblioteca();
		livroBiblioteca03.id = 1002;
		livroBiblioteca03.statusEmprestimo = true;
		livroBiblioteca03.ISBN = 6599044581L;
		
		System.out.println("Id: " + livroBiblioteca03.id);
		System.out.println("Status Emprestimo: " + livroBiblioteca03.statusEmprestimo);
		System.out.println("ISBN: " + livroBiblioteca03.ISBN);
		
	}
}
