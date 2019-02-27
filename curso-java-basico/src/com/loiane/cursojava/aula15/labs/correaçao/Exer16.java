package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a: ");
		int a = input.nextInt();
		
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau.");
		} else {
			System.out.println("Entre com o valor de b: ");
			int b = input.nextInt();
			
			System.out.println("Entre com o valor de c: ");
			int c = input.nextInt();
			
			double delta = Math.pow(b, 2) - (4*a*c);
			if (delta <0) {
				System.out.println("Delta negativo.");				
			} else {
				
				System.out.println("Delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("X 1 = " + x1);
				System.out.println("X 2 = " + x2);
			}
		}
		
		
		
	}

}
