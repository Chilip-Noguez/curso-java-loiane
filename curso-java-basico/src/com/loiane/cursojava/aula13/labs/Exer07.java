package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = input.nextDouble();
		
		double quadrado = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é: " + quadrado);

		System.out.println("O dobro da area do quadrado é: " + (quadrado*2));
		
		
	}

}
