package com.loiane.cursojava.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {

		int popA = 80000;
		int popB = 200000;
		int count = 0;
		
		while (popA < popB) {
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			count++;
		}
		
		System.out.println("Em " + count + " anos, a popula��o ser�:");
		System.out.println("Popula��o A � de: " + popA);
		System.out.println("Popula��o B � de:" + popB);
	}

}
