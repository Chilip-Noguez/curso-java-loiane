package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Digite o valor de n.");
		int n = input.nextInt();
		
		for (int i=0; i<=n; i++) {
			
			soma += 1/i;
		}
		
		System.out.println("\n Soma = " + soma);
	}

}
