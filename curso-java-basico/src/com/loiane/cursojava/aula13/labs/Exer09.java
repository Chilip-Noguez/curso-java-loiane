package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit para converter em Celsius: ");
		double farenheit = input.nextDouble();
		
		double celsius = (5* (farenheit-32) / 9);
		
		System.out.println("Graus em Celsius é: " + celsius);
		
	}

}
