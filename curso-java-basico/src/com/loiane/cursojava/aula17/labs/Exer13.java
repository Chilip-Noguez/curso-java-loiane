package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Entre com a base:");
		int base = input.nextInt();
		
		System.out.println("Entre com o expoente:");
		int expo = input.nextInt();
		
		int res = base;
		
		for (int i=1; i<expo; i++) {
			res *= base;
		}
		
		System.out.println(res);
		
	}

}
