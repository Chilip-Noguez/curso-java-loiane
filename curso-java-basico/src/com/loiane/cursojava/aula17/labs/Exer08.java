package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i =0;
		int num =0;
		int soma = 0;
		double media =0;
		
		/*
		for(int i =0; i < 5; i++) {
			System.out.println("Entre com um número:");
			num = input.nextInt();
			
			soma += num;
			
		}
		*/
		
		do {
			System.out.println("Entre com um número: ");
			num = input.nextInt();
			
			soma += num;
			
			i++;
		} while (i<5);
		
		media = soma /5;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		
	}

}
