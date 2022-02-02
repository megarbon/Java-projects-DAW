package secuenciales;

import java.util.Scanner;

//Ejercicio 1
//Escribir un programa que pregunte al usuario su nombre, y luego le salude.

public class Sec_1 {

	public static void main(String[] args) {
		String nombre;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tu nombre");
		nombre = teclado.nextLine();

		System.out.println("Hola " + nombre);

		teclado.close();

	}

}
