package secuenciales;

import java.util.Scanner;

public class Sec_16 {

	public static void main(String[] args) {
		float velocidad1,velocidad2,distancia,tiempo;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Dime la velocidad del coche 1 (km/h):"); // va más rápido
		velocidad1 = Float.parseFloat(sc.nextLine());		
		
		System.out.println("Dime la velocidad del coche 2 (más pequeña)(km/h):");
		velocidad2 = Float.parseFloat(sc.nextLine());	
		
		System.out.println("Dime la distancia entre los coches (km):");
		distancia = Float.parseFloat(sc.nextLine());	
		
		tiempo = distancia / (velocidad1 - velocidad2); // En horas
		tiempo = tiempo * 60;
		
		System.out.println("Lo alcanza en " + tiempo + " minutos.");

		sc.close();
	}

}
