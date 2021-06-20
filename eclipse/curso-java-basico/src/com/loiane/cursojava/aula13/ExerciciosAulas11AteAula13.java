package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAulas11AteAula13 {
	
	public static void main(String[] args) {
		
		System.out.println("Exercicio 01");
		System.out.println("Olá mundo");
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 02");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		System.out.println("O número informado foi: " + numero);
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 03");
		System.out.println("Digite o Primeiro número: ");
		int numeroUm = scan.nextInt();
		System.out.println("Digite o Segundo número: ");
		int numeroDois = scan.nextInt();
		int soma = numeroUm + numeroDois;
		System.out.println("A soma é: " + soma);
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 04");
		System.out.println("Digite a nota do primeiro bimestre: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a nota do segundo bimestre: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a nota do terceiro bimestre: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a nota do quarto bimestre: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media foi: " + media);
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 05");
		System.out.println("Digite um valor em metros");
		double metro = scan.nextDouble();
		System.out.println("O valor convertido para centrimetro é: " + (metro * 100));
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 06");
		System.out.println("Digite o raio de um circulo: ");
		double raio = scan.nextDouble();
		double areaCirculo = 3.14 * (raio * raio);
		System.out.println("A área do circulo é: " + areaCirculo);
		System.out.println("-------------------------");		
		
		System.out.println("Exercicio 07");
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		System.out.println("Digite a base: ");
		double base = scan.nextDouble();
		double areaQuadrado = altura * base;
		System.out.println("A área do quadrado é : " + areaQuadrado + " O dobro é : " + (areaQuadrado * 2));
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 08");
		System.out.println("Digite a quantidade quanto você ganha por hora: ");
		double qtdValorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhada no mês");
		double qtdHorasMes = scan.nextDouble();
		double salarioMes = qtdHorasMes * qtdValorHora;
		System.out.println("Seu salario no mês será: " + salarioMes);
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 09");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
