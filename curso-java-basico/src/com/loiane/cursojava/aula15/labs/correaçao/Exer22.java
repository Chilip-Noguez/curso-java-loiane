package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com Kg de morango: ");
		double qtdMorango = input.nextDouble();
		
		System.out.println("Entre com Kg de Maçã: ");
		double qtdMaca = input.nextDouble();
		
		double precoMorango = 0;
		double precoMaca = 0;
		double totalPeso = qtdMorango + qtdMaca;
		double percDesc = 0;
		
		if (qtdMorango <= 5) {
			precoMorango = 2.50;
		} else {
			precoMorango = 2.20;
		}
		
		if (qtdMaca <=5) {
			precoMaca = 1.80;
		} else {
			precoMaca = 1.50;
		}
		
		double precoTotalMorango = precoMorango * qtdMorango;
		double precoTotalMaca = precoMaca * qtdMaca;
		
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = 0;
		
		if (totalPeso > 8 || precoParcial > 25) {
			precoTotal = precoParcial -((precoParcial / 100) * 10);
		}
		
		
		System.out.println("Valor a pagar pelo Morango R$: " + precoTotalMorango);
		System.out.println("Valor a pagar pela Macça R$: " + precoTotalMaca);
		System.out.println("Preço total R$ " + precoTotal);
		
	}

}
