package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a cotcação do Dolar: ");
		cotacao = input.nextDouble();
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(df.format(vetorA[i]) + " ");
		}
	}

}
