package secuenciales;

import java.util.Scanner;

//Ejercicio 2
//Calcular el perímetro y área de un rectángulo dada su base y su altura
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
		System.out.println("El perímetro es " + perimetro + " y el área es " + area);
	}
}
