package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em  Celsius:");
		double celsius = input.nextDouble();
		
		double f = (celsius * 1.8)+ 32;
		
		System.out.println("A temperatura" +celsius +"C é igual a " + f + "F");
		
		
		
	}

}
