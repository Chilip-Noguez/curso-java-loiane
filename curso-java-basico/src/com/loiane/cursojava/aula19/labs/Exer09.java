package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		double[] vetC = new double[vetA.length];
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posica��o " + i);
			vetA[i] = input.nextInt();
		}
		
		for(int i=0; i<vetB.length; i++) {
			System.out.println("Entre com o valor do vetor B, posica��o " + i);
			vetB[i] = input.nextInt();
		}
		
		for(int i=0; i<vetC.length; i++) {
			vetC[i] = vetA[i] / vetB[i];
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i=0; i<vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i=0; i<vetC.length; i++) {
			System.out.print(df.format(vetC[i]) + " ");
		}
		
	}

}
