package com.loiane.cursojava.aula35.lab.Exercicio03;

public class Calculadora {
	
	public static double Somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double Subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double Multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double Dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double Potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	static int fat = 1;
	
	public static int Fatorial(int num1) {
		fat = fat * num1;
		if(num1 > 1) {
			Fatorial(num1 - 1);
		}
		return fat;
		
	}
}
