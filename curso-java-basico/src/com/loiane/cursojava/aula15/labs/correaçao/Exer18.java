package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		int num = input.nextInt();
		
		if (num % 2 == 0) {			
			System.out.println("N�mero par.");
		} else {
			System.out.println("N�mero impar.");
		}
		
		
	}

}
// 1:33:06