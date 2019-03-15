package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;

public class Exer22 {

	public static void main(String[] args) {

		int[] vetA = new int[10];
		int zero = 0, um = 0;
		double percentZero = 0, percentUm;
		
		for(int i=0; i<vetA.length; i++) {
			vetA[i] = (int) Math.round(Math.random() * 1);
			
			if(vetA[i] == 0) {
				zero++;
			} else {
				um++;
			}
		}
		
		percentZero = (zero * 100) / vetA.length;
		percentUm = (um * 100) / vetA.length;
		
		
		System.out.print("Vetor A aleatório = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat ("###,###.##");
		System.out.println();
		System.out.println("Porcentagem de 0's = " + df.format(percentZero));
		System.out.println("Porcentagem de 1's = " + df.format(percentUm));
		
	}

}
