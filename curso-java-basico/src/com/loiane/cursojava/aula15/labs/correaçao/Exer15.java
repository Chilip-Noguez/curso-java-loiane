package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre os 3 lados do tri�ngulo: ");
		int lado1 = input.nextInt();
		int lado2 = input.nextInt();
		int lado3 = input.nextInt();
		
		if (((lado1 + lado2) > lado3) || 
			((lado1+lado3)>lado2) ||
			((lado2+lado3)>lado1)) {
			String tipoTriangulo = "";
			if(lado1 == lado2 && lado1 == lado3) {
				tipoTriangulo = "Equil�tero";
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				tipoTriangulo = "Is�sceles";
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				tipoTriangulo = "Escaleno";
			}
			
			System.out.println("O trin�ngulo � do tipo: " + tipoTriangulo);
			
		} else {
			System.out.println("N�o forma um trin�ngulo.");
		}
		
		
		
		
		
	}

}
// 1:12:25