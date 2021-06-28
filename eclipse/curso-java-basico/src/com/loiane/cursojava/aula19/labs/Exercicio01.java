package com.loiane.cursojava.aula19.labs;

public class Exercicio01 {

	public static void main(String[] args) {
		int[] a = new int [5];
		int[] b = new int [5];
		
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 20;
		a[4] = 25;
		
		for (int i = 0 ; i<a.length; i++) {
			b[i] = a[i];
		}
		
		for (int valoresB : b) {
			System.out.println("Valores do vetor B: " + valoresB);
		}

	}

}
