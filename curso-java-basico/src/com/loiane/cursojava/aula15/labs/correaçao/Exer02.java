package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		int num = input.nextInt();
		
		if(num >= 0) {
			
			System.out.println("N�mero positivo.");
			
		} else {
			System.out.println("N�mero negativo. ");
			
		}
		
	}

}
//exercicio 2 4:14 min.