package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double salarioInicial = 0, salarioAtual = 0;
		double aumento;
		int anoAtual = 0, anoInicial = 0 ;
		double percentual = 1.5;
		boolean valido = false;
		
		do {
		
			System.out.println("Entre com seu salario: ");
			salarioInicial = input.nextDouble();
			
			System.out.println("Entre com o ano de contratação: ");
			anoInicial = input.nextInt();
			
			System.out.println("Entre com o ano atual: ");
			anoAtual = input.nextInt();
			
			for (int i=anoInicial; i<anoAtual; i++) {
				percentual = percentual * 2;
				
			}
			
		} while (!valido);
		
		
		salarioAtual = salarioInicial + (salarioInicial * percentual / 100);		
		System.out.println("Percentual " + percentual);
		System.out.println("Salario inicial R$: " + salarioInicial);
		System.out.println("Salario atual R$: " + salarioAtual);
		
	}

}
