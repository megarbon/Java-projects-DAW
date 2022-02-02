package secuenciales;
// Ejercicio 10

import java.util.Scanner;

public class Sec_10 {
	public static void main(String[] args) {
		Scanner sc;
		float parcial1, parcial2, parcial3, examen, trabajo, nota;
		
		sc = new Scanner(System.in);
		
		System.out.println("Dime la nota del parcial 1:");
		parcial1 = Float.parseFloat(sc.nextLine());		

		System.out.println("Dime la nota del parcial 2:");
		parcial2 = Float.parseFloat(sc.nextLine());	
		
		System.out.println("Dime la nota del parcial 3:");
		parcial3 = Float.parseFloat(sc.nextLine());	
		
		System.out.println("Dime la nota del examen:");
		examen = Float.parseFloat(sc.nextLine());	
		
		System.out.println("Dime la nota del trabajo:");
		trabajo = Float.parseFloat(sc.nextLine());
		
		sc.close();
			
		nota = (float)(((parcial1 + parcial2 + parcial3)/3)*0.55 + 0.3*examen + 0.15*trabajo);
		
		System.out.println( "Nota final:" + nota);
		
	}
	
}
