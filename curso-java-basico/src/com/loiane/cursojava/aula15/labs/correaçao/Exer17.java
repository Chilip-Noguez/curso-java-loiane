package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o ano: ");
		int ano = input.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 &&  ano % 100 != 0)) {
			System.out.println("� bissexto. ");
		} else {
			System.out.println("n�o � bissexto. ");
		}
		
		
	}

}
