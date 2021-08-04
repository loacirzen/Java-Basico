package com.loiane.cursojava.aula30;

public class Carro {
	
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustive;
	
	
	
	public Carro() {}
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustive) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustive = consumoCombustive;
	}


	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com 2 parametros");
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parametros");
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
