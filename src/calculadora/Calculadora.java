package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido a la Calculadora");

		System.out.print("Introduce el primer número: ");
		double num1 = scanner.nextDouble();

		System.out.print("Introduce el segundo número: ");
		double num2 = scanner.nextDouble();

		System.out.print("Introduce la operación (+ para suma, - para resta): ");
		char operacion = scanner.next().charAt(0);

		if (operacion == '+') {
			double resultado = suma(num1, num2);
			System.out.println("El resultado de la suma es: " + resultado);
		} else if (operacion == '-') {
			double resultado = resta(num1, num2);
			System.out.println("El resultado de la resta es: " + resultado);
		} else {
			System.out.println("Operación no válida.");
		}

	}

	public static double suma(double num1, double num2) {
		return num1 + num2;
	}

	public static double resta(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;
	}
}
