/******************
 * 
 * Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda
 * estas pueden ser dolares, yenes o libras.
 * El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que será una cadena. 
 * @author melakug
 *
 ******************/

import java.util.Scanner;
public class procedimientos_7 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		double euro, yen, dolar, yuan;
		int select;
		System.out.println("Cantidad en Euros: ");
		euro = sc.nextFloat();
		do {
		System.out.println("Elige divisa a convertir\n(1)Dollar\n(2)Yen\n(3)Yuan");
		select = sc.nextInt();
		}while((select > 0) && (select > 4)); //controlamos que solo entren las valores que queremos
		//Usamos un switch para el menu
		switch (select) {
			case 1:
				System.out.println("Coversion: " + toDolar(euro) + "$ dolar");
				break;
			case 2:
				System.out.println("Coversion: " + toYen(euro) + "¥ yen");
				break;
			case 3:
				System.out.println("Coversion: " + toYuan(euro) + "¥ yuan");
				break;
			default:
				break;
		}
	}
	
	public static double toDolar(double valor) {
		return (1.17 * valor);
	}
	
	public static double toYen(double valor) {
		return (7.46 * valor);
	}
	
	public static double toYuan(double valor) {
		return (132.26 * valor);
	}
}
