package com.loiane.cursojava.aula24.labs;

public class Exer06 {
	
	public static void main (String[] args) {
		
		AgendaCelular agenda = new AgendaCelular();
		
		agenda.nome = "Chilip Noguêz";
		agenda.telefones = new String[5];
		agenda.email = "@hotmail.com";
		agenda.endereco = "livramento";
		
		agenda.telefones[0] = "99999.9999";
		agenda.telefones[1] = "99999.9998";
		agenda.telefones[2] = "99999.9997";
		
		System.out.println("Nome: " + agenda.nome);
		System.out.println("Número: " + agenda.telefones[1]);
		System.out.println("Email: " + agenda.email);
		System.out.println("Endereço: " + agenda.endereco);
		
	}

}
//aula 24 exercicios 22:26