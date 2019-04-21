package com.loiane.cursojava.aula24.labs;

public class Exer01 {
	public static void main (String[] Args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 35;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		System.out.println(lampada.garantiaMeses);
		System.out.println(lampada.potencia);
		System.out.println(lampada.cor);
		System.out.println(lampada.tipoLuz);
		System.out.println(lampada.tipoAbajur);
		System.out.println(lampada.tipos[0]);
		System.out.println(lampada.tipos[1]);
		
		
	}

}
