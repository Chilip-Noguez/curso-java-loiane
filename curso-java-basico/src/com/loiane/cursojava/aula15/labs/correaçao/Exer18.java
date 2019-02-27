package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = input.nextInt();
		
		if (num % 2 == 0) {			
			System.out.println("Número par.");
		} else {
			System.out.println("Número impar.");
		}
		
		
	}

}
// 1:33:06