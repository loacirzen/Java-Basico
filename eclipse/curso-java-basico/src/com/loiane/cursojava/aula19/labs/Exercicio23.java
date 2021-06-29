package com.loiane.cursojava.aula19.labs;

import java.util.Random;

public class Exercicio23 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		boolean flag = false;
		int count = 0; 
		
		for(int i =0; i<vetorA.length; i++) {
			vetorA[i] = new Random().nextInt(10) + 1;
		}
		
		System.out.print("Elementos pares: ");
		
		do {
			
			if(vetorA[count] % 2 == 0) {
				System.out.print(vetorA[count] + " ");
			}else if(vetorA[count] % 2 != 0) {
				System.out.println("");
				System.out.println("O elemento na posição " + count + " cujo valor é: " + vetorA[count] + " não é par");
				System.out.print("Saindo do loop while !!!");
				flag = true;
			}
			
			if(count < vetorA.length) {
				count++;
			}
			
		}while(!flag);

	}
}
