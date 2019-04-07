package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = input.nextInt();
		}
		
		boolean primo = true;
		String msg = "";
		
		for(int i=0; i<vetorA.length; i++) {
			
			primo = true;
			for (int j=2; j<vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}			
			}
			msg = "";
			if(primo) {
				msg = " primo";
			} else {
				msg = " não é primo";
			}
			System.out.println(vetorA[i] + msg);
		}
	}

}
