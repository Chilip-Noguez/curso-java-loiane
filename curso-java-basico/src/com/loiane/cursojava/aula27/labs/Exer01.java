package com.loiane.cursojava.aula27.labs;

public class Exer01 {
	
	public static void main (String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		System.out.println("Lampada está " + lampada.ligada);
		
		lampada.desligar();
		
		System.out.println("Lampada está " + lampada.ligada);
		
		
		System.out.println("===========================");
		
		lampada.ligar();
		if (lampada.ligada) {
			System.out.println("A lampada está ligada.");
		} else {
			System.out.println("A lampada está desligada.");
		}
		
		lampada.desligar();
		if (lampada.ligada) {
			System.out.println("A lampada está ligada.");
		} else {
			System.out.println("A lampada está desligada.");
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
