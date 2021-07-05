package com.loiane.cursojava.aula24.labs;

public class Exercicio03_LivroDeLivraria {

	public static void main(String[] args) {
		LivroDeLivraria livrolivraria01 = new LivroDeLivraria();
		livrolivraria01.preco = 34.0;
		livrolivraria01.qtdLivros = 5;
		livrolivraria01.ISBN = 85797100490L;
		
		System.out.println("Preço: " + livrolivraria01.preco);
		System.out.println("Qtd Livros: " + livrolivraria01.qtdLivros);
		System.out.println("ISBN: " + livrolivraria01.ISBN);
		
		
		System.out.println("----------------------------");
		
		LivroDeLivraria livrolivraria02 = new LivroDeLivraria();
		livrolivraria02.preco = 19.0;
		livrolivraria02.qtdLivros = 10;
		livrolivraria02.ISBN = 8506067421L;
		
		System.out.println("Preço: " + livrolivraria02.preco);
		System.out.println("Qtd Livros: " + livrolivraria02.qtdLivros);
		System.out.println("ISBN: " + livrolivraria02.ISBN);
		
		System.out.println("----------------------------");
		
		LivroDeLivraria livrolivraria03 = new LivroDeLivraria();
		livrolivraria03.preco = 18.5;
		livrolivraria03.qtdLivros = 8;
		livrolivraria03.ISBN = 6599044581L;
		
		System.out.println("Preço: " + livrolivraria03.preco);
		System.out.println("Qtd Livros: " + livrolivraria03.qtdLivros);
		System.out.println("ISBN: " + livrolivraria03.ISBN);

	}
		
}
