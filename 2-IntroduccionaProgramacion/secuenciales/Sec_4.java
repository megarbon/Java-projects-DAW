package secuenciales;
//Ejercicio 4

//Dados dos n�meros, mostrar la suma, resta, divisi�n y multiplicaci�n de ambos.

import java.util.Scanner;

public class Sec_4 {
	public static void main(String[] args) {
		Scanner sc;

		sc = new Scanner(System.in);

		double num1, num2, cociente, producto;
		int inum1, inum2;
		
		System.out.println("Introduce el numero 1:");
		num1 = sc.nextDouble();

		System.out.println("Introduce el numero 2:");
		num2 = sc.nextDouble();

		sc.close();

		
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1+num2));
		System.out.println("La resta de " + num1 + " y " + num2 + " es " + (num1-num2));
		
		cociente = num1/num2;
		producto = num1*num2;
		
		System.out.println("El cociente de " + num1 + " y " + num2 + " es " + cociente);
		System.out.println("El producto de " + num1 + " y " + num2 + " es " + producto);
		
		inum1 = 5;
		inum2 = 10;
		
		System.out.println("El cociente de " + inum1 + " y " + inum2 + " es " + (double)inum1/inum2);
	}
}
