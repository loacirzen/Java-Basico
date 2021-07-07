package com.loiane.cursojava.aula27.lab.Exercicio03;

public class Aluno {
	
	String nome;
	int matricula;
	String curso;
	String[] disciplinas;
	double[] notaDisciplinas;

	boolean verificaAprovado(double nota) {
		if(nota < 7) {
			return false;
		} else {
			return true;
		}
	}
}
