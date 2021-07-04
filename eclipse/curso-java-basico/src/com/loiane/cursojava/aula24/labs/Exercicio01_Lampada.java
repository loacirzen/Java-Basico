package com.loiane.cursojava.aula24.labs;

public class Exercicio01_Lampada {

	public static void main(String[] args) {
		
		Lampada inducao = new Lampada();
		inducao.marca = "SemMarca";
		inducao.preco = 20.0;
		inducao.vidaUtil = 60;
		inducao.lumensWatts = 90;
		inducao.IRC = 90;
		inducao.kelvin = 3000;
		
		System.out.println("Marca: " + inducao.marca);
		System.out.println("Preço: " + inducao.preco);
		System.out.println("Vida Util: " + inducao.vidaUtil);
		System.out.println("LumensWatts(Lm/W): " + inducao.lumensWatts);
		System.out.println("Indice de Reprodução de Cor (IRC): " + inducao.IRC);
		System.out.println("lumensWatts(°k): " + inducao.kelvin);
		
		System.out.println("-----------------------------");
		
		Lampada fluorescente = new Lampada();
		fluorescente.marca = "Iluminim";
		fluorescente.preco = 70.0;
		fluorescente.vidaUtil = 7.5;
		fluorescente.lumensWatts = 103;
		fluorescente.IRC = 85;
		fluorescente.kelvin = 4500;
		
		System.out.println("Marca: " + fluorescente.marca);
		System.out.println("Preço: " + fluorescente.preco);
		System.out.println("Vida Util: " + fluorescente.vidaUtil);
		System.out.println("LumensWatts(Lm/W): " + fluorescente.lumensWatts);
		System.out.println("Indice de Reprodução de Cor (IRC): " + fluorescente.IRC);
		System.out.println("lumensWatts(°k): " + fluorescente.kelvin);
		
	}

}
