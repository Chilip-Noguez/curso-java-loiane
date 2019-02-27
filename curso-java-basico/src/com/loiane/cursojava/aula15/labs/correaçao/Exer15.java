package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre os 3 lados do triângulo: ");
		int lado1 = input.nextInt();
		int lado2 = input.nextInt();
		int lado3 = input.nextInt();
		
		if (((lado1 + lado2) > lado3) || 
			((lado1+lado3)>lado2) ||
			((lado2+lado3)>lado1)) {
			String tipoTriangulo = "";
			if(lado1 == lado2 && lado1 == lado3) {
				tipoTriangulo = "Equilátero";
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				tipoTriangulo = "Isósceles";
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				tipoTriangulo = "Escaleno";
			}
			
			System.out.println("O trinângulo é do tipo: " + tipoTriangulo);
			
		} else {
			System.out.println("Não forma um trinângulo.");
		}
		
		
		
		
		
	}

}
// 1:12:25