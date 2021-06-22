package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		for ( int i = 1; i < 6 ; i++ ) {
			System.out.println("i tem valor: " + i);
		}
		
		System.out.println("---------------");
		
		for ( int x = 5; x > 0 ; x-- ) {
			System.out.println("x tem valor: " + x);
		}
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor: " + i + "  -  e j tem valor: " + j);
		}
		
		int i = 0;
		for ( ; i < 5 ; ) {
			System.out.println("i tem valor: " + i);
			i++;
		}
		
		int cont = 0;
		for ( ; cont < 10 ; ) {
			System.out.println("cont vale: " + cont);
			cont += 2;
		}
		
		
		int soma = 0;
		for(int j=1; j<5; soma += j++);
		System.out.println("Valor da soma: " + soma);
		
	}
}
