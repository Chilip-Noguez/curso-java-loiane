package com.loiane.cursojava.aula27.labs;

public class Exer01 {
	
	public static void main (String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		System.out.println("Lampada est� " + lampada.ligada);
		
		lampada.desligar();
		
		System.out.println("Lampada est� " + lampada.ligada);
		
		
		System.out.println("===========================");
		
		lampada.ligar();
		if (lampada.ligada) {
			System.out.println("A lampada est� ligada.");
		} else {
			System.out.println("A lampada est� desligada.");
		}
		
		lampada.desligar();
		if (lampada.ligada) {
			System.out.println("A lampada est� ligada.");
		} else {
			System.out.println("A lampada est� desligada.");
		}
		
		
		System.out.println("===========================");
		
		lampada.mostrarEstado();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		System.out.println("===========================");

		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
		

	}

}
