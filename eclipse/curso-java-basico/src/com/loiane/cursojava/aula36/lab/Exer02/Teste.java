package com.loiane.cursojava.aula36.lab.Exer02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso: ");
		String nome = scan.nextLine();
		
		System.out.println("Entre com o horário do curso: ");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do professo: ");
		String nomeProf = scan.nextLine();
		
		System.out.println("Entre com o departamento: ");
		String depProf = scan.nextLine();
		
		System.out.println("Entre com o email: ");
		String emailProf = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(emailProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
		System.out.println("---- Alunos -----");
		for(int i=0; i<alunos.length; i++) {
			
			scan.nextLine();
			
			System.out.println("Entre com o nome do Aluno " + (i+1) + ": ");
			String nomeAluno = scan.nextLine();
			
			System.out.println("Entre com a matricula do Aluno: " + (i+1) + ": ");
			String matAluno = scan.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0; j<notas.length; j++) {
				System.out.println("Entre com a nota " + (j+1) + ": ");
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setMatricula(matAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
	}

}
