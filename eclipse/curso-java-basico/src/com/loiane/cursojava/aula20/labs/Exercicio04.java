package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		String[][] AgendaDiasHoras = new String [31][24];
		String compromisso = "";
		int op = 0, dia = 0, hora = 0;
		
		do {
			
			System.out.println("-------------MENU-------------");
			System.out.println("- 1 - MARCAR COMPROMISSO     -");
			System.out.println("- 2 - ALTERAR COMPROMISSO    -");
			System.out.println("- 3 - CONSULTAR COMPROMISSO  -");
			System.out.println("- 4 - AGENDA DO MES          -");
			System.out.println("- 5 - SAIR                   -");
			System.out.println("------------------------------");
			System.out.print("-ENTRE COM UMA OPÇÃO: ");
			op = scan.nextInt();
			
			if(op == 5) {
				System.out.println("Saindo do programa");
				flag = false;
			} else if (op == 1 || op == 2) {
				System.out.print("Entre com o dia: ");
				dia = scan.nextInt();
				System.out.print("Entre com a hora: ");
				hora = scan.nextInt();
				System.out.print("Entre com o compromisso: ");
				compromisso = scan.next();
				AgendaDiasHoras[dia - 1][hora -1] = compromisso;
			} else if ( op == 4) {
				for(int i = 0; i<AgendaDiasHoras.length; i++) {
					System.out.println("Dia " + (i + 1) + " : ");
					for(int j = 0; j<AgendaDiasHoras[i].length; j++) {
						if(AgendaDiasHoras[i][j] != null) {
							System.out.print(" Hora " + (j + 1) + " : " + AgendaDiasHoras[i][j]);
						}
					}
				}
			}
			
		}while(flag);
		
	}
}
