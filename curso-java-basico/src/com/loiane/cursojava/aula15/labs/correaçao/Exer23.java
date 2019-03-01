package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com tipo de carne:");
		System.out.println("1 - Filé duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipo = input.nextInt();
		
		System.out.println("Entre com quantida (Kg) de carne:");
		double qtdCarne = input.nextDouble();
		
		double precoKg = 0;
		
		if (tipo ==1) {
			System.out.println(qtdCarne + "Kg - Filé Duplo.");
			
			if (qtdCarne <= 5) {
				precoKg = 4.90;
			} else {
				precoKg = 5.80;
			}
		} else if (tipo == 2) {
			System.out.println(qtdCarne + "Kg - Alcatra.");
			
			if (qtdCarne <= 5) {
				precoKg = 5.90;
			} else {
				precoKg = 6.80;
			}
		} else if (tipo == 3) {
			System.out.println(qtdCarne + "Kg - Picanha.");
			
			if (qtdCarne <= 5) {
				precoKg = 6.90;
			} else {
				precoKg = 7.80;
			}
		}
		
		double total = qtdCarne * precoKg;
		System.out.println(qtdCarne + "kg * " + precoKg + " = " + total );
		
		System.out.println("Compra no catão? Digite 1 para sim: ");
		int cartao = input.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar R$" + (total - desconto));
		} else {
			System.out.println("Valor a pagar R$:" + total );
		}
		
		
	}

}
