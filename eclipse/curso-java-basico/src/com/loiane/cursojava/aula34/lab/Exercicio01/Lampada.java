package com.loiane.cursojava.aula34.lab.Exercicio01;

public class Lampada {
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean estado;
	
	public Lampada() {
		estado = false;
		System.out.println(estado);
	}
	
	public boolean retornarEstado() {
		return estado;
	}
	
	public boolean ligarLampada() {
		return estado = true;
	}
	
	public boolean desligarLampada() {
		return estado = false;
	}
	
	public boolean alterarEstado() {
		if (estado == true) {
			return estado = false;
		} else {
			return estado = true;
		}
	}
}
