package com.loiane.cursojava.aula19.labs;

import java.util.Random;

public class Exercicio21 {

	public static void main(String[] args) {
		double[] vetorA = new double[20];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = new Random().nextInt(20) + 1; 
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("O valor da cotação do dolar: " + vetorA[i] + "R$ ");
		}

	}

}
