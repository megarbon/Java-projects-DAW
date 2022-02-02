package secuenciales;
// Ejercicio 12

import java.util.Scanner;

public class Sec_12 {
	public static void main(String[] args) {
		Scanner sc;
		int x1, y1, x2, y2;
		double distancia;
		
		sc = new Scanner(System.in);
		
		System.out.println("Coordenadas del punto 1:");
		
		System.out.println("Introduce la x: ");
		x1 = Integer.parseInt(sc.nextLine());		
		System.out.println("Introduce la y: ");
		y1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Coordenadas del punto 2:");	
		
		System.out.println("Introduce la x: ");
		x2 = Integer.parseInt(sc.nextLine());		
		System.out.println("Introduce la y: ");
		y2 = Integer.parseInt(sc.nextLine());
		
		distancia = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
		System.out.println( "Distancia: " + distancia);
		
		sc.close();
	}
	
}
