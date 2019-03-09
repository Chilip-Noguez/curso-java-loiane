package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int popA = 0, popB = 0, count = 0;
		double taxaA = 0;
		double taxaB = 0;
		boolean  valido = false;
		
		valido = false;
		do {
			System.out.println("Entre com a primeira população:");
			popA = input.nextInt();
			
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("População deve ser maior que zero!");
			}
		} while (!valido);
		
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento:");
			taxaA = input.nextDouble();
			if(taxaA > 0) {
				valido = true;
			} else {
				System.out.println("Taxa deve ser maior que zero.");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a segunda população:");
			popB = input.nextInt();
			
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("População deve ser maior que zero.");
			}
			
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento:");
			taxaB = input.nextDouble();
			if(taxaB > 0 ) {
				valido = true;
			} else {
				System.out.println("População deve ser maior que zero.");
			}
		} while(!valido);
		
			
		
		
		while (popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			count ++;
		}
		
		System.out.println("Em " + count + " anos, a população será:");
		System.out.println("População A é de: " + popA);
		System.out.println("População B é de:" + popB);
		
	

}
	
}
