package com.loiane.cursojava.aula24.labs;

public class Exer05 {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.numContaCorrente = "1000054";
		contaCorrente.agencia = "2341";
		contaCorrente.contaEspecial = true;
		contaCorrente.limite = 700;
		contaCorrente.saldo = -10;
		
		
		System.out.println("Número da conta = " + contaCorrente.numContaCorrente);
		System.out.println("Saldo = " + contaCorrente.saldo);
		System.out.println("Conta especial = " + contaCorrente.contaEspecial);
		System.out.println("Limite = " + contaCorrente.limite);
		
		
	}

}
