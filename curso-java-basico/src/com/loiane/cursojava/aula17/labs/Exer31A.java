package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31A {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double salario = 1000;
		double percentual = 1.5; //1996
		
		salario += (salario/100) * percentual;
		
		DecimalFormat format = new DecimalFormat("###,###.###");
		
		for (int i=1997; i<=2015; i++) {
			percentual *= 2;
			salario += (salario/100) * percentual;
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}
		
	}

}
