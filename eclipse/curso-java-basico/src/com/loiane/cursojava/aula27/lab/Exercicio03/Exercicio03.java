package com.loiane.cursojava.aula27.lab.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		aluno.nome = "Loacir";
		aluno.matricula = 102030;
		aluno.curso = "Analise e Desenvolvimento de Sistemas";
		aluno.disciplinas = new String[3];
		aluno.notaDisciplinas = new double[3];
		
		aluno.disciplinas[0] = "Programação OO";
		aluno.disciplinas[1] = "Sistemas Operacionais";
		aluno.disciplinas[2] = "Banco de Dados";
		
		for(int i = 0; i<aluno.notaDisciplinas.length; i++) {
			System.out.print("Entre com o valor da nota disciplina " + aluno.disciplinas[i] + " : ");
			aluno.notaDisciplinas[i] = scan.nextDouble();
		}
		
		for(int i=0 ; i<aluno.notaDisciplinas.length; i++) {
			System.out.println(aluno.disciplinas[i] + " : " + aluno.verificaAprovado(aluno.notaDisciplinas[i]));
		}

	}

}
