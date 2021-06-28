package com.loiane.cursojava.aula19.labs;

import java.util.Random;

public class Exercicio16 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int somaMenorQuinze = 0;
		int contIgualQuinze = 0;
		int somaMaiorQuinze = 0;
		int contMaiorQuinze = 0;
		double mediaMaiorQuinze = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = new Random().nextInt(100) + 1;
		}
		
		System.out.print("Valores menor que 15: ");
		for(int j = 0; j<vetorA.length; j++) {
			if(vetorA[j] < 15) {
				somaMenorQuinze = somaMenorQuinze + vetorA[j];
				System.out.print(vetorA[j] + " ");
			} 
		}
		
		System.out.println("");
		System.out.print("Soma dos valores menor que 15: " + somaMenorQuinze);

		
		for(int j = 0; j<vetorA.length; j++) {
			if(vetorA[j] == 15) {
				contIgualQuinze++;
			} 
		}
		
		System.out.println("");
		System.out.print("Qtd de elementos iguais a 15: " + contIgualQuinze);
		
		System.out.println("");
		System.out.print("Valores maior que 15: ");
		for(int j = 0; j<vetorA.length; j++) {
			if(vetorA[j] > 15) {
				somaMaiorQuinze = somaMaiorQuinze + vetorA[j];
				contMaiorQuinze ++;
				System.out.print(vetorA[j] + " ");
			} 
		}
		System.out.println("");
		mediaMaiorQuinze = (somaMaiorQuinze / contMaiorQuinze);
		System.out.print("A media dos valores maior 15 é: " + mediaMaiorQuinze);
	}
}
