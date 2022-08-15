package one.digitalinnovation.gof;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String operador = "";
		
		System.out.println("Seja bem vindo a Calculadora do Matheus!!!");
		System.out.println("Qual Operação deseja fazer?");
		System.out.println("+ , - , / ou x");
		operador = scan.next();
		
		System.out.println("Digite o 1º número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o 2º número: ");
		int num2 = scan.nextInt();
		
		if(operador.equals("+")) {
			Calculadora.Soma(num1, num2);
			return;
		}
		else if(operador.equals("-")) {
			Calculadora.Subtração(num1, num2);
			return;
		}
		else if(operador.equals("/")) {
			Calculadora.Divisão(num1, num2);
			
		}
		else if(operador.equals("x") || operador.equals("X")) {
			Calculadora.Multiplicação(num1, num2);
		}
		
	}

}
