package com.loiane.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel (double km) {
		return km/consumoCombustivel;
	}

}
