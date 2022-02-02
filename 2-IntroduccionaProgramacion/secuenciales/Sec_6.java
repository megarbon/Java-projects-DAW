package secuenciales;
// Ejercicio 6
// Calcular la media de tres n�meros pedidos por teclado.


import java.util.Scanner;

public class Sec_6 {
	public static void main(String[] args) {
		Scanner sc;
		float num1, num2, num3, media;
		
		sc = new Scanner(System.in);

		System.out.print("Introduce el numero 1:");
		num1 = sc.nextFloat();
		
		System.out.print("Introduce el numero 2:");
		num2 = sc.nextFloat();
		
		System.out.print("Introduce el numero 3:");
		num3 = sc.nextFloat();

		sc.close();

		media = (num1 + num2 + num3) /3;


		System.out.println("La media es  " + media );
	}
}
