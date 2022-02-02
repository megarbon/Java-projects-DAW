package secuenciales;
// Ejercicio 9

import java.util.Scanner;

public class Sec_9 {
	public static void main(String[] args) {
		Scanner sc;
		float precio;
		
		sc = new Scanner(System.in);
		
		System.out.println("Dime el precio:");
		precio = Float.parseFloat(sc.nextLine());		

		System.out.println("Precio final:" + (precio - precio*0.15));	
		
		sc.close();
		
	}
	
}
