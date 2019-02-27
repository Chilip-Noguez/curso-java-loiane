package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		double num1 = input.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		double num2 = input.nextDouble();
		
		System.out.println("Escolha a operação: ");
		String op = input.next();
		
		boolean valida = true; //flag
		
		double resultado = 0;
		switch (op) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default: System.out.println("Inválido!");
				 valida = false;
		}
		
		/*
		if (valida) {
		if (resultado % 2 == 0 && resultado >= 0) {
			System.out.println("Par e positivo, resultado é: " +resultado);
		} else if(resultado >= 0 ) {
			System.out.println("Impar e positivo, resultado é: " + resultado);
		} else if (resultado % 2 == 0 && resultado < 0) {
			System.out.println("Par e negativo, resultado é: " + resultado);
		} else if(resultado < 0) {
			System.out.println("Impar e negativo, resultado é: " + resultado);
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