package secuenciales;

import java.util.Scanner;

public class Sec_18 {
	public static void main(String[] args) {
		String nombre, apellido1, apellido2, iniciales;

		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dime tu primer apellido:");
		apellido1 = sc.nextLine();
		System.out.print("Dime tu segundo apellido:");
		apellido2 = sc.nextLine();

		iniciales = "" + nombre.charAt(0) + apellido1.charAt(0) + apellido2.charAt(0);
					
		System.out.println( "Las iniciales son: " + iniciales);
		
		sc.close();
		
	}
		
}



