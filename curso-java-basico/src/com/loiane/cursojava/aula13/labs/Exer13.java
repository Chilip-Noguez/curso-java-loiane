package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanto você recebe por hora? ");
		double valorHora = input.nextDouble();
		
		System.out.println("Qual sua carga horária mensal? ");
		double cargaHrMes = input.nextDouble();
		
		double salarioBruto = valorHora * cargaHrMes;
		double impostoDeRenda = salarioBruto * 11 / 100;
		double inss = salarioBruto * 8 / 100;
		double sindicato = salarioBruto * 5 / 100;
		double totalDescontos = inss + sindicato + impostoDeRenda;
		double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
		
		System.out.println("Salario bruto é: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " +impostoDeRenda);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Seu salário liquido é: " + salarioLiquido);

		
	}

}
