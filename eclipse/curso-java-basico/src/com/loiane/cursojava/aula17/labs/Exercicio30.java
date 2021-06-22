package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;
public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Montar a tabuada de: ");
		int tabuada = scan.nextInt();
		System.out.print("Começar por: ");
		int comeco = scan.nextInt();
		System.out.print("Terminar em: ");
		int terminar = scan.nextInt();
		
		System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + comeco + " e terminando em " + terminar);
		
		for( ; comeco <= terminar ; comeco ++) {
			int result = comeco * tabuada;
			System.out.println(tabuada + " X " + comeco + " = " + result);
		}
	}
}
