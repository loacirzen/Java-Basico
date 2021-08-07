package com.loiane.cursojava.aula34.lab.Correcao03;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplina;
	private double [][] notasDisciplina; 
	
	public Aluno() {
		nomeDisciplina = new String[3];
		notasDisciplina = new double[3][4];
	}
	
	public Aluno(String nome, String matricula, String nomeCurso) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplina = new String[3];
		this.notasDisciplina = new double[3][4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String[] nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public double[][] getNotasDisciplina() {
		return notasDisciplina;
	}

	public void setNotasDisciplina(double[][] notasDisciplina) {
		this.notasDisciplina = notasDisciplina;
	}
	
	public void mostraInfo() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for(int i = 0; i<notasDisciplina.length; i++) {
			System.out.println("Notas das Disciplinas " + nomeDisciplina[i]);
			for(int j=0; j<notasDisciplina[i].length; j++) {
				System.out.println(notasDisciplina[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public boolean verificarAprovado(int indice) {
		if (obterMedia(indice) >= 7) {
			return true;
		}
		
		return false;
	}
	
	private double obterMedia(int indice) {
		double soma = 0;
		
		for(int i=0; i<notasDisciplina[indice].length; i++) {
			soma += notasDisciplina[indice][i];
		}
		
		double media = soma / 4;
		return media;
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDisciplina[pos] = nomeDisciplina;
	}
	
	public void setNomePosIJ(int posI, int posJ, double nota) {
		this.notasDisciplina[posI][posJ] = nota;
	}
}
