package com.loiane.cursojava.aula31;

public class Carro {	
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustive;
	

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustive);
	}
	
	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustive;
	}

	
	private double divideKMPorConsumoCombustive(double km) {
		return km/this.consumoCombustive;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKMPorConsumoCombustive(km);
	}


}
