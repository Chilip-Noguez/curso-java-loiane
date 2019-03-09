package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int next = 0, num1 = 1, num2 = 1, n;
		
				
		System.out.println(num1);
		System.out.println(num2);
		
		
		while (next < 500){
				
				next = num1 + num2;
				num1 = num2;
				num2 = next;
						
				System.out.println(next);
			}
		} 

		
	
	
}


