package com.loiane.cursojava.aula19.labs;

public class Exer36 {

	public static void main(String[] args) {

		int[] vetorA = new int[11];
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = i;
		}
		
		for (int i=0; i<vetorA.length; i++) {
			
				System.out.println(Math.pow(2, i));
			
		}
		
	}

}
