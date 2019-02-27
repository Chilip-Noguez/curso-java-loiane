package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros pra soma-los: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		System.out.println("A soma dos numeros foi: " + (num1+num2));
		
	}

}
