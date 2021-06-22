package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo;
		String continuar = "";
		int cq = 0 , bs = 0 , bo = 0 , ha = 0 , ch = 0 , re = 0, quantidade = 0;

		do {
			System.out.println("--------------- MENU ---------------");
			System.out.println("Especificação		Código	Preço");
			System.out.println("Cachorro Quente		100		R$ 1,20");
			System.out.println("Bauru Simples		101		R$ 1,30");
			System.out.println("Bauru com ovo		102		R$ 1,50");
			System.out.println("Hambúrguer		103		R$ 1,20");
			System.out.println("Cheeseburguer		104		R$ 1,30");
			System.out.println("Refrigerante		105		R$ 1,00");
			
			System.out.print("Entre com o código: ");
			codigo = scan.nextInt();
			
			if(codigo < 100 || codigo > 105) {
				System.out.println("O codigo não existe");
			}else {
				System.out.print("Entre com a quantidade: ");
				quantidade = scan.nextInt();
			}
			
			if(codigo == 100) {
				cq = cq + quantidade;
			}else if(codigo == 101) {
				bs = bs + quantidade;
			}else if(codigo == 102) {
				bo = bo + quantidade;
			}else if(codigo == 103) {
				ha = ha + quantidade;
			}else if(codigo == 104) {
				ch = ch + quantidade;
			}else if(codigo == 105) {
				re = re + quantidade;
			} else {
				System.out.println("Opção inválida");
			} 
			

			
			System.out.print("Deseja informar outro item (S)Sim ou (N)Não: ");
			continuar = scan.next();
			

		}while(continuar.equalsIgnoreCase("S"));
		
		System.out.println("Nota fiscal: ");

		if(cq > 0) {
			System.out.println(cq + " Cachorro Quente -  R$: " + cq * 1.20);
		}
		
		if(bs > 0) {
			System.out.println(bs + " Bauru Simples   -  R$: " + bs * 1.30);
		}
		
		if(bo > 0) {
			System.out.println(bo + " Bauru com ovo   -  R$: " + bo * 1.50);
		}
		
		if(ha > 0) {
			System.out.println(ha + " Hambúrguer      -  R$: " + ha * 1.20);
		}
		
		if(ch > 0) {
			System.out.println(ch + " Cheeseburguer   -  R$: " + ch * 1.30);
		}
		
		if(re > 0) {
			System.out.println(re + " Refrigerante    -  R$: " + re * 1.00);
		}
	}

}
