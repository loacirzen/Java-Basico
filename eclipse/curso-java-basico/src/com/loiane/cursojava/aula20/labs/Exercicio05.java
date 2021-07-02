package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		String[][][] AgendaDiasMesHoras = new String [31][12][8];
		String compromisso = "";
		int op = 0, dia = 0, mes = 0, hora = 0;
		
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
				System.out.print("Entre com o mês: ");
				mes = scan.nextInt();
				System.out.print("Entre com a hora: ");
				hora = scan.nextInt();
				System.out.print("Entre com o compromisso: ");
				compromisso = scan.next();
				AgendaDiasMesHoras[dia - 1][mes -1][hora -1] = compromisso;
			} else if ( op == 4) {
				for(int i = 0; i<31; i++) {
					//System.out.println("Dia " + (i + 1) + " : ");
					for(int j = 0; j<12; j++) {
						//System.out.println("Mes " + (j + 1) + " : ");
						for(int k= 0; k<8; k++) {
							//System.out.println(" i=" + i +" - j="+ j + " - k =" + k);
							if(AgendaDiasMesHoras[i][j][k] != null) {
								System.out.println("Mês: "+ (j + 1)+" - Dia: " + (i + 1) + " - Hora: " + (k + 1) + " : " + AgendaDiasMesHoras[i][j][k]);
							}
						}
					}
				}
			}
			
		}while(flag);
	}
}
