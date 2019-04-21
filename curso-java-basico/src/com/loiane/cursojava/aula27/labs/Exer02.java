package com.loiane.cursojava.aula27.labs;

public class Exer02 {
	
	public static void main(String[] args) {
		
		ContaCorrente minhaConta = new ContaCorrente();
		
		minhaConta.numContaCorrente = "1234567";
		minhaConta.agencia = "1234";
		minhaConta.saldo = 2500;
		minhaConta.especial = true;
		minhaConta.limite = 550;
		//minhaConta.saqueValor = 700;
		
		
		minhaConta.exibirSaldo();
		
		minhaConta.exibirSaldo();
		
		minhaConta.depositoValor = 800;
		
		minhaConta.exibirSaldo();
		
		minhaConta.sacar();
		
		minhaConta.exibirSaldo();
		
	}

}
