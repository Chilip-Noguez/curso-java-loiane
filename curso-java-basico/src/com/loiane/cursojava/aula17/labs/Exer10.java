package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num1=0, num2=0;
		
		System.out.println("Entre com o primeiro número:");
		num1 = input.nextInt();
		
		System.out.println("Entre com o segundo número:");
		num2 = input.nextInt();
		
		
		for (int i = num1; i <= num2; i++ ) {
			System.out.println(i);
		}
		
	}

}
