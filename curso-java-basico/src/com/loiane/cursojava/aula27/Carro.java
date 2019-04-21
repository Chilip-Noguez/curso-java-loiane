package com.loiane.cursojava.aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do caro é: " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel (double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
