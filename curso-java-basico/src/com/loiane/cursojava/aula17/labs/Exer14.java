package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 0, par = 0, impar = 0;
		
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Entre com 10 n�meros:");
			num = input.nextInt();
			
			if (num % 2 == 0) {
				par ++;
			} else {
				impar ++;
			}
		}
		System.out.println("N�meros �mpares: " + impar + ". N�meros pares: " + par);
		
	}

}
