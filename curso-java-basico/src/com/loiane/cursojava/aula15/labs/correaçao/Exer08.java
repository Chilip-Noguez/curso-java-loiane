package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com primeiro o valor do produto: ");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Entre com o segundo valor do produto:");
		double valor2 = entrada.nextDouble();
		
		System.out.println("Entre com o terceiro valor do produto:");
		double valor3 = entrada.nextDouble();
		
		if (valor1 <= valor2 && valor1 <= valor3) {
			System.out.println("Produto 1 é o mais barato, com o valor de: R$ " + valor1);
		} else if (valor2 <= valor1 && valor2 <= valor3) {
			System.out.println("Produto 2 é o mais barato, com o valor de: R$ " + valor2);
		} else if (valor3 <= valor1 && valor3 <= valor2) {
			System.out.println("Produto 3 é o mais barato, com o valor de: R$ " + valor3);
		}
		
	}

}
