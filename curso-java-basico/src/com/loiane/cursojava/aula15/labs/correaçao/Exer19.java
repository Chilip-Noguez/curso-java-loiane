package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		double num1 = input.nextDouble();
		
		System.out.println("Entre com o segundo n�mero: ");
		double num2 = input.nextDouble();
		
		System.out.println("Escolha a opera��o: ");
		String op = input.next();
		
		boolean valida = true; //flag
		
		double resultado = 0;
		switch (op) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default: System.out.println("Inv�lido!");
				 valida = false;
		}
		
		/*
		if (valida) {
		if (resultado % 2 == 0 && resultado >= 0) {
			System.out.println("Par e positivo, resultado �: " +resultado);
		} else if(resultado >= 0 ) {
			System.out.println("Impar e positivo, resultado �: " + resultado);
		} else if (resultado % 2 == 0 && resultado < 0) {
			System.out.println("Par e negativo, resultado �: " + resultado);
		} else if(resultado < 0) {
			System.out.println("Impar e negativo, resultado �: " + resultado);
		}
		} */
		
		if(valida) {
			if(resultado >= 0) {
				System.out.println("resultado positivo.");
			} else {
				System.out.println("resultado negativo. ");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("par.");
			} else {
				System.out.println("impar. ");
			}
			System.out.println("Resultado: " + resultado);
		}
		
	}

}
// 1:34:12