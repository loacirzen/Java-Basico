package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		double [] temperatura = new double [365];
		temperatura[0] = 31.3;
		temperatura[1] = 32;
		temperatura[2] = 33.7;
		temperatura[3] = 34;
		temperatura[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperatura[0]);
		System.out.println(temperatura.length);
		
		for(int i= 0; i<temperatura.length; i++) {
			System.out.println("A temperatura do dia " + (i+1) + " é: " + temperatura[i]);
		}
		
		for (double temp : temperatura) {
			System.out.println(temp);
		}

	}

}
