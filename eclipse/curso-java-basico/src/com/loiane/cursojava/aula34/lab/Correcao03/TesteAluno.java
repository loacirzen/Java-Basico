package com.loiane.cursojava.aula34.lab.Correcao03;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.setNome(scan.next());
		
		System.out.println("Entre com o nome do curso: ");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Entre com a matricula: ");
		aluno.setMatricula(scan.next());
		
		
		for(int i=0; i<aluno.getNomeDisciplina().length; i++) {
			System.out.println("Entre com o nome da disciplina " + i);
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		
		for(int i=0; i<aluno.getNotasDisciplina().length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno.getNomeDisciplina()[i]);
			for(int j=0; j<aluno.getNotasDisciplina()[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno.setNomePosIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostraInfo();
		
		
		for(int i=0; i<aluno.getNomeDisciplina().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplina()[i] + " foi aprovado ");
			} else {
				System.out.println("Disciplina " + aluno.getNomeDisciplina()[i] + " foi reprovado ");
			}
		}
	}
}
