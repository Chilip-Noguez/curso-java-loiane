package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro:");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo número inteiro:");
		int num2 = input.nextInt();
		
		System.out.println("Digite um núemero real:");
		double num3 = input.nextDouble();
		
		System.out.println("Produto do dobro do primeiro mais metade do segundo número é: " + ((num1 *2)+(num2/num2)));
		
		System.out.println("A soma do triplo do primeiro número com o terceiro é: " + (num1*3+num3));
		
		System.out.println("Terceiro número elevado ao cubo é: " + Math.pow(num3, 3));
	}

}
