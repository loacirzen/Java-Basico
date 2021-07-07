package com.loiane.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.consumoCombustivel);
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println("Retorno da autonomia: " + autonomia);
		
		double qtdCombustivel = van.calcularCombustivel(10);
		System.out.println(qtdCombustivel);

	}

}
