package secuenciales;

import java.util.Scanner;

//Ejercicio 2
//Calcular el per�metro y �rea de un rect�ngulo dada su base y su altura
public class Sec_2 {
	public static void main(String[] args) {
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		float perimetro, area, base, altura;
		
		System.out.println("Introduzca la base");
		base = sc.nextFloat();
		
		System.out.println("Introduzca la altura");
		altura = sc.nextFloat();
		
		sc.close();
		
		perimetro = 2 * base + 2 * altura;
		area = base * altura;
		System.out.println("El per�metro es " + perimetro + " y el �rea es " + area);
	}
}
