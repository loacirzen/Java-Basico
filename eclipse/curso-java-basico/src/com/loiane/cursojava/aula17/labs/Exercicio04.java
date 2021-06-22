package com.loiane.cursojava.aula17.labs;

public class Exercicio04 {

	public static void main(String[] args) {

		int cont = 0;
		
		for(int paisA = 80000, paisB = 200000 ; paisA <= paisB; paisA += (paisA/100) * 3, paisB += (paisB/100) * 1.5 ) {
			cont++;
		}
		 	
		System.out.println("Quantidade de anos necessário é de: " + cont);
	}
}
