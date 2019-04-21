package com.loiane.cursojava.aula27.labs;

public class Lampada {
	
	String modelo;
	String tensao;
	int potecnia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("L�mpada est� ligada.");
		} else {
			System.out.println("L�mpada est� desligada.");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();
		} else {
			ligar();
		}
	}
	

}
