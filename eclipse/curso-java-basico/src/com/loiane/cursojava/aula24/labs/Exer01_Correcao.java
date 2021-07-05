package com.loiane.cursojava.aula24.labs;

public class Exer01_Correcao {

	public static void main(String[] args) {
		LampadaCorrecao lampada = new LampadaCorrecao();
		lampada.modelo = "A60";
		lampada.tensao = "Bivoit";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
	
	}

}
