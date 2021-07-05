package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class Exer04_Correcao {

	public static void main(String[] args) {
		LivroDeBibliotecaCorrecao livro = new LivroDeBibliotecaCorrecao();
		livro.titulo = "Mastering ExtJs";
		livro.autor = "Loiane Groner";
		livro.qtdPaginas = 402;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();

	}

}
