package com.loiane.cursojava.aula19.labs;

public class Exercicio22 {

	public static void main(String[] args) {
	int[] vetorA = new int[10];
	int countOne = 0;
	int countZero = 0;
	
	for(int i = 0; i<vetorA.length; i++) {
		vetorA[i] = (int)Math.round(Math.random() * 1);
	}
	
	for(int i = 0; i<vetorA.length; i++) {
		if (vetorA[i] == 0) {
			countZero++;
		}else if(vetorA[i] == 1) {
			countOne++;
		}
	}
	
	double percentualZero = (countZero * 100) / vetorA.length;
	double percentualOne = (countOne * 100) / vetorA.length;
	
	System.out.println("O percentual de numeros 0 é de: " + percentualZero);
	System.out.println("O percentual de numeros 1 é de: " + percentualOne);
	
	}
}
