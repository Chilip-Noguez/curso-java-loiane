package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = input.nextDouble();
		
		double area = Math.PI * (raio*raio);
		double area2 = Math.PI * (Math.pow(raio, 2));
				
		System.out.println("A área do círculo é: " + area);
		System.out.println("A área do círculo é: " + area2);
		
		
	}

}
