
/***************************
 *  Muestra por pantalla los resultados de las 4 operaciones básicas entre 2 números que se le pedirán al usuario
 *  realizando una subrutina para cada una de dichas operaciones.
 *  El resultado de la operación se imprime dentro de la subrutina.
 *  
 *  Crea una función en java que reciba dos números reales y devuelva su suma.
 *  
 *  Crea una función en java que reciba un número entero y devuelva su factorial.
 *  
 * @author melakug
 *
 */

import java.util.Scanner;

public class procedimientos_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact, num1, num2, result;
		String operador;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Calculadora, introduce los valores de num1 y num2 ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("introduce el operador (+, -, *, /, %) ");
		operador = sc.nextLine();
		switch (operador) {
		case "+":
			sumar(num1, num2);
			break;
		case "-":
			restar(num1, num2);
			break;
		case "*":
			multiplicar(num1, num2);
			break;
		case "/":
			dividir(num1, num2);
			break;
		case "%":
			modulo(num1, num2);
			break;
		default: 
			break;
		}
	
	}

	public static int sumar(int num1, int num2) {
		return num1 + num2;
	}

	public static int restar(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static float dividir(int num1, int num2) {
		return num1 / num2;
	}

	public static int modulo(int num1, int num2) {
		return num1 % num2;
	}


}
