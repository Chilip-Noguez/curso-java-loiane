package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro n�mero � maior: " +num1);
		} else {
			System.out.println("O segundo n�mero � maior:" + num2);
		};
		
		
		/*switch(num1 - num2) {
		case num1>num2: System.out.println("Num 1 � maior que num 2!"); break;
		default: System.out.pritln("Num 2 � maior que num 1!"); break;
		}*/
		
		
	}

}
