package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		int contResp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Telefonou para vítima? (S)Sim ou (N)Não");
		String resposta = scan.nextLine();
		if(resposta.toUpperCase().equals("S")) {
			contResp = contResp + 1;
		}
		
		System.out.println("Esteve no local do crime? (S)Sim ou (N)Não");
		resposta = scan.next();
		if(resposta.toUpperCase().equals("S")) {
			contResp = contResp + 1;
		}
		
		System.out.println("Mora perto da vítima? (S)Sim ou (N)Não");
		resposta = scan.next();
		if(resposta.toUpperCase().equals("S")) {
			contResp = contResp + 1;
		}
		
		System.out.println("Devia para vítima? (S)Sim ou (N)Não");
		resposta = scan.next();
		if(resposta.toUpperCase().equals("S"))  {
			contResp = contResp + 1;
		}
		
		System.out.println("Já trabalhou com a vítima? (S)Sim ou (N)Não");
		resposta = scan.next();
		if(resposta.toUpperCase().equals("S"))  {
			contResp = contResp + 1;
		}
	
		
		if (contResp == 2) {
			System.out.println("Suspeito");
		} else if((contResp >= 3) && (contResp <= 4)) {
			System.out.println("Cúmplice");
		} else if (contResp == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}

	}

}
