package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com metros para converter em centimetros: ");
		double metros = input.nextDouble();
		
		double centimetros = 100 * metros;
		
		System.out.println("A convers�o de " + metros + "m para cent�metros �: " + centimetros +"cm");
		
		
	}

}
