package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com 3 números: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro número é maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3){
			System.out.println("O segundo número é maior: " + num2);
		} else {
			System.out.println("O terceiro número é maior: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("O primeiro número é menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3){
			System.out.println("O segundo número é menor: " + num2);
		} else {
			System.out.println("O terceiro número é menor: " + num3);
		}
	}

}//31:34
