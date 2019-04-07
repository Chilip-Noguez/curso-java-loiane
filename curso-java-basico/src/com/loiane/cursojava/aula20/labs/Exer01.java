package com.loiane.cursojava.aula20.labs;

public class Exer01 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];
		
		
		int maior = Integer.MIN_VALUE;
		int lin =0;
		int col = 0;
		for (int i=0; i<numerosAleatorios.length; i++) {
			for (int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = (int) Math.round(Math.random() * 9);
				
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					lin = i;
					col = j;
				}
				
			}
		}
		
		for (int i=0; i<numerosAleatorios.length; i++) {
			for (int j=0; j<numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
				
				System.out.print("Maior = " + maior + " posição -> " + lin + " " + col);
			
		
	}

}
