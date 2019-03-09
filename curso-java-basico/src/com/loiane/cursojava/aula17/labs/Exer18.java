package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = input.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++) {
			if (num % i ==0) {
				System.out.println("Não é primo, divisível por: " + i);
				primo = false;
			}
		}
		
		if(primo){
			System.out.println("É numero primo.");
		}
		
		
	}

}
