package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio para reajuste: ");
		double sal = input.nextDouble();
		
		/*if (sal <= 280) {
			double reajuste = sal * 20 / 100;
			double novoSal = reajuste + sal;
			System.out.println("Sal�rio atual �: " + sal + " Reajuste foi de: 20%." + " Sal�rio reajustado �: " + novoSal);
		} else if (sal > 280 && sal <= 700) {
			double reajuste = sal * 15 / 100;
			double novoSal = reajuste + sal;
			System.out.println("Sal�rio atual �: " + sal + " Reajuste foi de: 15%." + " Sal�rio reajustado �: " + novoSal);
		} else if (sal > 700 && sal <= 1500) {
			double reajuste = sal * 10 / 100;
			double novoSal = reajuste + sal;
			System.out.println("Sal�rio atual �: " + sal + " Reajuste foi de: 10%." + " Sal�rio reajustado �: " + novoSal);
		} else if (sal > 1500) {
			double reajuste = sal * 5 / 100;
			double novoSal = reajuste + sal;
			System.out.println("Sal�rio atual �: " + sal + " Reajuste foi de: 5%." + " Sal�rio reajustado �: " + novoSal);
		}*/
		int percentual = 0;
		if (sal <= 280) {
			int percentual = 20;
		} else if (sal > 280 && sal < 700) {
			percentual = 15;
		} else if (sal >= 700 && sal <1500) {
			percentual = 10;
		} else if (sal >= 1500) {
			percentual = 5;
		}
		
		double aumento = (sal / 100) * percentual;
		double salarioAjustado = sal + aumento;
		
		System.out.println("Sal�rio: " + sal);
		System.out.println("Percentual : " + percentual);
		System.out.println("Aumento : " + aumento);
		System.out.println("Sal�rio ajustado: " + salarioAjustado);
	}

} //53:00
