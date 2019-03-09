package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = input.nextInt();
		
		int fatorial = 1;
		for(int i=num; i>=1; i--) {
			fatorial *= i;
			System.out.println(i);
		};
		
		System.out.println(fatorial);
		
		
		
	}

}
