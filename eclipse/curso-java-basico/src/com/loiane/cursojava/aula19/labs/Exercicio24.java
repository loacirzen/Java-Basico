package com.loiane.cursojava.aula19.labs;

public class Exercicio24 {

	public static void main(String[] args) {
		int[] vetorA = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
		boolean flag = false;
		for(int i = 0, j = vetorA.length; i<vetorA.length && i < j ; i++, j--) {
			if(vetorA[i] == vetorA[j-1]) {
				flag = flag && true;
			}else {
				flag = flag && false;
			}
		}
		
		if(flag == true) {
			System.out.print("O conteudo do vetor é um palindromo");
		} else {
			System.out.print("O conteudo do vetor não é um palindromo");
		}
	}
}
