package com.loiane.cursojava.aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustive;
	
	Carro(){
		System.out.println("Classe carro foi instaciada");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustive_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustive = consumoCombustive_;
	}
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustive);
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustive;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustive;
		return qtdCombustivel;
	}
	
	
}
