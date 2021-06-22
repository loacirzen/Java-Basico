package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;
public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cont = 1;
		double precoMercadoria = 0;
		double totalPreco = 0;
		double troco = 0;
		double dinheiro;
		
		do {
			System.out.print("Produto " + cont + ": R$ ");
			 precoMercadoria = scan.nextDouble();
			 totalPreco = totalPreco + precoMercadoria;
			 cont++;
			
		} while(precoMercadoria != 0);
		System.out.println("Total: R$ " + totalPreco);
			
		do {
			System.out.print("Dinheiro: ");
			 dinheiro = scan.nextDouble();
			 troco = dinheiro - totalPreco;
			 if(troco < 0) {
				 System.out.println("Está faltando: R$ " + (troco * -1));
			 }
		}while(troco < 0);
		
		System.out.print("Troco: " + troco);
	}
}
