package secuenciales;
// Ejercicio 5
// Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. Recordad que
// la fórmula para la conversión es:
// C = (F-32) * 5 / 9

import java.util.Scanner;

public class Sec_5 {
	public static void main(String[] args) {
		Scanner sc;

		sc = new Scanner(System.in);

		double fahrenheit, celsius;

		System.out.print("Introduce la temperatura ºF:");
		fahrenheit = sc.nextDouble();

		sc.close();

		celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("La temperatura es  " + celsius + " ºC. " );
	}
}
