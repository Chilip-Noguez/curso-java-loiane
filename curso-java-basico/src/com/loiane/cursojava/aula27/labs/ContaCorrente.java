package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {
	
	String numContaCorrente;
	String agencia;
	double saldo;
	boolean especial;
	double limite;
	double saqueValor;
	double depositoValor;
	
	void sacar() {
		
		if(saqueValor < (saldo + limite) ) {
			System.out.println("Aguarde as cédulas.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		saldo = saldo - saqueValor;
		
	}
	
	double depositar() {
		return saldo += depositoValor;
	}
	
	void exibirSaldo() {
		System.out.println("O saldo é: " + saldo);
	}

}
