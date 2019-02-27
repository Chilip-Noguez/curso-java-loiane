package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro número é maior: " +num1);
		} else {
			System.out.println("O segundo número é maior:" + num2);
		};
		
		
		/*switch(num1 - num2) {
		case num1>num2: System.out.println("Num 1 é maior que num 2!"); break;
		default: System.out.pritln("Num 2 é maior que num 1!"); break;
		}*/
		
		
	}

}
