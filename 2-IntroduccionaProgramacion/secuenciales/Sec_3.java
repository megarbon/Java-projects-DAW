package secuenciales;

import java.util.Scanner;

//Ejercicio 3
//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

public class Sec_3 {
	public static void main(String[] args) {
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		double cateto1, cateto2, hipotenusa;
		
		System.out.println("Introduce el cateto 1:");
		cateto1 = sc.nextDouble();
		
		System.out.println("Introduce el cateto 2:");
		cateto2 = sc.nextDouble();
		
		sc.close();
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("La hipotenusa del triangulo de catetos " + cateto1 + " y " + cateto2 + " es " + hipotenusa);
	}
}

