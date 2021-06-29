package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int fatorial = 0 , cont = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print("Digite um valor para o elemento: " + i + "° : ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int x = 0; x<vetorA.length; x++) {
			System.out.println("");
			fatorial = vetorA[x];
			cont = vetorA[x];
			for (int i = vetorA[x] ; i > 1 ; i--) {
			    
				if(cont == vetorA[x]) {
					System.out.print(cont + "! = " + cont);
				}else {
					System.out.print(" . " + cont);
				}
				cont = i - 1;
				fatorial = fatorial * cont;		
			}
			System.out.println(" = " + fatorial);
		}
	}

}
