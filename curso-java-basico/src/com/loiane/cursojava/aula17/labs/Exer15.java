package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int next, num1 = 1, num2 = 1, n;
		
		System.out.println("Entre com o n-ésimo termo da série de fibonacci:");
		n = input.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		do {
			for (int i =3; i<=n; i++) {
				
				next = num1 + num2;
				num1 = num2;
				num2 = next;
						
				System.out.println(next);
			}
		} while (next < 500);

		
	}

}
