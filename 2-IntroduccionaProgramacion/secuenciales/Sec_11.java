package secuenciales;
// Ejercicio 11

import java.util.Scanner;

public class Sec_11 {
	public static void main(String[] args) {
		Scanner sc;
		int num1, num2;
		
		sc = new Scanner(System.in);
		
		System.out.println("Dime el número 1:");
		num1 = Integer.parseInt(sc.nextLine());		

		System.out.println("Dime el número 2:");
		num2 = Integer.parseInt(sc.nextLine());		
		
		System.out.println( "Distancia:" + Math.abs(num1-num2));
		
		sc.close();
	}
	
}
