package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro para fatoração:");
		int num = input.nextInt();
		
		
		
		System.out.println("Fatorial de: " + num);
		System.out.print(num + "! = ");
		
		int fat =1;
		for(int i=num; i>=1; i--) {
			fat = fat * i;
						
			System.out.print(i + " . ");
			
		}
		System.out.println("= " + fat);
		
	}

}
