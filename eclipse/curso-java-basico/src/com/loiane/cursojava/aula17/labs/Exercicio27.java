package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;
public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double menorTemp = 1000;
		double maiorTemp = -1000;
		double somaTemp = 0;
		int cont = 0;
		String op = "";
		
		do {
			System.out.println("Digite uma temperatura: ");
			double temperatura = scan.nextDouble();
			
			
			if(temperatura > maiorTemp) {
				maiorTemp = temperatura;
			}
			
			if(temperatura < menorTemp) {
				menorTemp = temperatura;
			}
			
			somaTemp = somaTemp + temperatura;
			System.out.println("Deseja informar outra temperatura (S)Sim ou (N)Não");
			op = scan.next();
			cont++;
			
		}while(op.equalsIgnoreCase("S"));
		
		double mediaTemp = (somaTemp / cont);
		System.out.println("A maior temperatura: " + maiorTemp);
		System.out.println("A menor temperatura: " + menorTemp);
		System.out.println("A media é: " + mediaTemp);
	}
}
