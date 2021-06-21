package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio07_Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor inteiro para A: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o valor inteiro para B: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o valor inteiro para C: ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3){
			System.out.println("O num1 é maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3){
			System.out.println("O num2 é maior: " + num1);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O num3 é maior: " + num3);
		} 	
		
		if (num1 <= num2 && num1 <= num3){
			System.out.println("O num1 é menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3){
			System.out.println("O num2 é menor: " + num1);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("O num3 é menor: " + num3);
		} 	

	}

}
