package one.digitalinnovation.gof;

import java.util.Scanner;

//Singleton "Preguiçoso"

public class Calculadora {
	
	private static Calculadora instancia;
	
	public Calculadora() {
		
		super();
		
	}
	
	
	public static Calculadora getInstancia() {
		if (instancia == null) {
			instancia = new Calculadora();
		}
		return instancia;
	}
	
	public static int Soma (int num1, int num2) {
		int total = num1 + num2;
		System.out.println(total);
		return total;
		
	}

	public static int Subtração (int num1, int num2) {
		int total = num1 - num2;
		System.out.println(total);
		return total;
	}
	
	public static int Divisão (int num1, int num2) {
		int total = num1 / num2;
		System.out.println(total);
		return total;
		
	}
	
	public static int Multiplicação (int num1, int num2) {
		int total = num1 * num2;
		System.out.println(total);
		return total;
	}

}
