package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[][] matrizM = new int[3][3];
		
		for (int i=0; i<matrizM.length; i++) {
			for (int j=0; j<matrizM[i].length; j++) {
				System.out.println("Entre com o valor para posição [" + i + "] " + "[" + j + "]");
				matrizM[i][j] = input.nextInt();
			}
		}
		
		int qtdPar = 0;
		int qtdImpar = 0;
		for (int i=0; i<matrizM.length; i++) {
			for (int j=0; j<matrizM[i].length; j++) {
				if (matrizM[i][j] % 2 ==0) {
					qtdPar++;
				} else {
					qtdImpar++;
				}
			}
		}
		
		for (int i=0; i<matrizM.length; i++) {
			for (int j=0; j<matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Quantidade pares = " + qtdPar);
		System.out.println("Quantidade impares = " + qtdImpar);
	}

}
