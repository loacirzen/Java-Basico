package com.loiane.cursojava.aula18;

public class BreakLabelNaoEBoaPratica {

	public static void main(String[] args) {
		for(int i=1; i<=4 ; i++ ) {
			rotulo1 : {
				rotulo2 : {
					rotulo3 : {
						if (i == 1) {
							break rotulo1;
						}	
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		}
	}
}
