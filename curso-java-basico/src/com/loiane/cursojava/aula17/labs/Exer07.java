package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i = 0;
		int num = 0;
		int maior = Integer.MIN_VALUE;
		
		
		/*for (i = 0; i < 5; i++ ) {
			System.out.println("Entre com um número.");
			num = input.nextInt();
			
			if(num > maior) {
				maior = num;
				System.out.println("O numero mudou: " + maior);
			}
			
		}; */
		
		/*do {
			System.out.println("Entre com um número.");
			num = input.nextInt();
			i ++;
			
			if(num > maior) {
				maior = num;
				System.out.println("O numero mudou: " + maior);
			}
		} while (i<5);
		
		System.out.println("O maior num digitado foi: " + maior);
		*/
		
		
		while (i < 5) {
			System.out.println("Entre com um número.");
			num = input.nextInt();
			i++;
			
			if(num > maior) {
				maior = num;
				System.out.println("O numero mudou: " + maior);
			}
		}
		System.out.println("O maior num digitado foi: " + maior);
	}

}
