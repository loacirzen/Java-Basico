package com.loiane.cursojava.aula13;

import java.util.Scanner;
import java.math.*;

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
		System.out.println("Digite o em Farenheit: ");
		double farenheit = scan.nextDouble();
		double celsius = ( 5 * (farenheit - 32)/9);
		System.out.println("A temperatura em Celsius é: " + celsius);
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 10");
		System.out.println("Digite o em Celsius: ");
		double c = scan.nextDouble();
		double f = (c * 1.8) + 32; 
		System.out.println("A temperatura em Farenheit é: " + f);
		System.out.println("-------------------------");
		
		System.out.println("Exercicio 11");
		System.out.println("Digite um número inteiro: ");
		int inteiro1 = scan.nextInt();
		System.out.println("Digire outro número inteiro: ");
		int inteiro2 = scan.nextInt();
		System.out.println("Digite um número real");
		double real = scan.nextDouble();
		
		double resultado1 = (inteiro1 * 2) % (inteiro2 / 2);
		System.out.println("O produto do dobro do primeiro com metada do segundo: " + resultado1);
		
		double resultado2 = (inteiro1 * 3) + real;
		System.out.println("a soma do triplo com o terceiro: " + resultado2);
		
		double resultado3 = Math.pow(real, 3); 
		System.out.println("O terceiro elevado ao cubo:" + resultado3);
		System.out.println("-------------------------");
		
		
		System.out.println("Exercicio 12");
		System.out.println("Digite sua altura: ");
		double suaAltura = scan.nextDouble();
		double pesoIdeal = (76.7 * suaAltura) - 58;
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		System.out.println("-------------------------");
		
		
		System.out.println("Exercicio 13");
		System.out.println("Digite a quantidade quanto você ganha por hora: ");
		qtdValorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhada no mês");
		qtdHorasMes = scan.nextDouble();
		salarioMes = qtdHorasMes * qtdValorHora;
		System.out.println("Seu salario no mês será: " + salarioMes);
		double ir = (salarioMes * 11) / 100;
		double inss = (salarioMes * 8) / 100;
		double sindicato = (salarioMes * 5) / 100;
		double salarioLiquido = salarioMes - ir - inss - sindicato;
		System.out.println("O salario liquido é: " + salarioLiquido);
		System.out.println("-------------------------");
		
		
		System.out.println("Exercicio 14");
		System.out.println("Digite o tamanho do arquivo em MB");
		double mb = scan.nextDouble();
		System.out.println("Digite a velocidade da sua Internet");
		double velocidade = scan.nextDouble();
		double calculoTempo = ((mb * 1024) / velocidade) / 60; 
		System.out.println("O tempo estimado é de: " + calculoTempo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
