package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro:");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro:");
		int num2 = input.nextInt();
		
		System.out.println("Digite um n�emero real:");
		double num3 = input.nextDouble();
		
		System.out.println("Produto do dobro do primeiro mais metade do segundo n�mero �: " + ((num1 *2)+(num2/num2)));
		
		System.out.println("A soma do triplo do primeiro n�mero com o terceiro �: " + (num1*3+num3));
		
		System.out.println("Terceiro n�mero elevado ao cubo �: " + Math.pow(num3, 3));
	}

}
