package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com tr�s n�meros: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro n�mero � maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3){
			System.out.println("O segundo n�mero � maior: " + num2);
		} else {
			System.out.println("O terceiro n�mero � maior: " + num3);
		}
		
	}

}
