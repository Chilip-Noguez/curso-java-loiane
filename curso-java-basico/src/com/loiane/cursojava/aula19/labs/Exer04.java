package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] vetA = new int[15];
		double[] vetB = new double[vetA.length];
		
		for (int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor da posição - " + i);
			vetA[i] = input.nextInt();
			
			vetB[i] = Math.sqrt(vetA[i]);
		}
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println();
		System.out.println("Vetor B = ");
		for(int i=0; i<vetB.length; i++) {
			System.out.print(df.format(vetB[i]) + " ");
		}
		
	}

}
