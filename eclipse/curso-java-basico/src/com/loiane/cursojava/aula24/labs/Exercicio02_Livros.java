package com.loiane.cursojava.aula24.labs;

public class Exercicio02_Livros {

	public static void main(String[] args) {
		Livro livro01 = new Livro();
		livro01.titulo = "Memorias Postumas de Bras Cubas";
		livro01.autor = "Machado de Assis";
		livro01.genero = "Romance";
		livro01.editora = "Abril";
		livro01.qtdPaginas = 230;
		livro01.ISBN = 85797100490L;
		
		System.out.println("Titulo: " + livro01.titulo);
		System.out.println("Autor: " + livro01.autor);
		System.out.println("Genero: " + livro01.genero);
		System.out.println("Editora: " + livro01.editora);
		System.out.println("Paginas: " + livro01.qtdPaginas);
		System.out.println("ISBN: " + livro01.ISBN);
		
		System.out.println("-----------------------");
		
		Livro livro02 = new Livro();
		livro02.titulo = "Dom Casmuro";
		livro02.autor = "Machado de Assis";
		livro02.genero = "Romance";
		livro02.editora = "Melhoramento";
		livro02.qtdPaginas = 288;
		livro02.ISBN = 8506067421L;
		
		System.out.println("Titulo: " + livro02.titulo);
		System.out.println("Autor: " + livro02.autor);
		System.out.println("Genero: " + livro02.genero);
		System.out.println("Editora: " + livro02.editora);
		System.out.println("Paginas: " + livro02.qtdPaginas);
		System.out.println("ISBN: " + livro02.ISBN);
		
		System.out.println("-----------------------");
		
		Livro livro03 = new Livro();
		livro03.titulo = "Os Sertões";
		livro03.autor = "Euclides Da Cunha";
		livro03.genero = "Romance";
		livro03.editora = "Pe da Letra";
		livro03.qtdPaginas = 288;
		livro03.ISBN = 6599044581L;
		
		System.out.println("Titulo: " + livro03.titulo);
		System.out.println("Autor: " + livro03.autor);
		System.out.println("Genero: " + livro03.genero);
		System.out.println("Editora: " + livro03.editora);
		System.out.println("Paginas: " + livro03.qtdPaginas);
		System.out.println("ISBN: " + livro03.ISBN);
		
		
		

	}

}
