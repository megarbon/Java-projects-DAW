/*****************
 * 
 *  Crea una aplicación que nos calcule el área de un círculo, cuadrado o un triángulo.
 *  Pediremos de qué figura queremos calcular su área (nos darán una de las tres)
 *  y según lo introducido pedirá los valores necesarios para calcular el área. 
 *  Crea un método por cada figura para calcular cada área que devolverá un número real como valor del área. 
 *  Muestra el resultado por pantalla. 
 *  Añade un menú para mejorar el ejercicio. En el menú habrá una opción de salir para poder terminar el programa.
 * 
 * @author melakug
 *
 */

import java.util.Scanner;

public class procedimientos_4 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int figura, base, altura, radio;
		double area;
		System.out.println("Selecciona la figura para calcular su area\n(1):Rectángulo\n(2)Triangulo\n(3)Circunferencia\n(0)Terminar\n");
		figura = sc.nextInt();
		switch (figura) {
		case 1:
			area = areaRectangulo(base, altura);
			break;
		case 2:
			area = areaTriangulo(base, altura);
			break;
		case 3:
			area = areaCircunferencia(radio);
			break;
		default:
			System.out.println("Error, parametro incorrecto");
			return;
		}
		System.out.println("Area = " + area);

	}
	
	public static double areaRectangulo(int l1, int l2) {
		return l1 * l2;
	}
	
	public static double areaTriangulo(int b, int h) {
		return (b * h) / 2;
	}

	public static double areaCircunferencia(int r) {
		return Math.pow((Math.PI * r), 2);
	}


}
