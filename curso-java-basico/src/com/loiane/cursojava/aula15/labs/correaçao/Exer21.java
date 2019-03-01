package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com os litros.");
		double litros = input.nextDouble();
		
		System.out.println("Tipo: A - G");
		String tipo = input.next();
		
		double precoAlc = 1.90;
		double precoGas = 2.50;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		if(tipo.equalsIgnoreCase("a")) {
			
			if(litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			} 
			total = litros * precoAlc;
			
			
		} else if (tipo.equalsIgnoreCase("g")){
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			total = litros * precoGas;
		}
		
		totalDesc = (total /100) * percDesconto;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("Total R$: " + total);
		System.out.println("Desconto de R$: " + totalDesc);
		System.out.println("Valor a ser pago R$: " + precoAPagar);
		
	}

}
//1:47:24