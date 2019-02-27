package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = input.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		
		
	}

}
