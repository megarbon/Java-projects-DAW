package secuenciales;

import java.util.Scanner;

public class Sec_20 {
	public static void main(String[] args) {
		int euro2, euro1, cent50, cent20, cent10, total_euros, total_centimos;
		Scanner sc;
		
		sc = new Scanner(System.in);

		//1. Recogida de datos para el problema:
		System.out.print("Monedas de 2 euros:");
		euro2 = Integer.parseInt(sc.nextLine());

		System.out.print("Monedas de 1 euro:");
		euro1 = Integer.parseInt(sc.nextLine());

		System.out.print("Monedas de 50 céntimos:");
		cent50 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Monedas de 20 céntimos:");
		cent20 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Monedas de 10 céntimos:");
		cent10 = Integer.parseInt(sc.nextLine());
		
		//2. Calcular Euros (sumar monedas de 2 euros * 2 + monedas de 1 euro
		total_euros = euro2 * 2 + euro1;
		
		//3. Calcular centimos (monedas de 50c * 50 + monedas de 20c * 20 moneda de 10c * 10
		total_centimos = cent50 * 50 + cent20 * 20 + cent10 * 10;
		
		//4. Convertir céntimos a euros (división entera entre 100)
		total_euros = total_euros + (int)(total_centimos / 100);
		total_centimos = total_centimos % 100;
		
		System.out.println( total_euros + " euros y " + total_centimos + " céntimos.");
		
		sc.close();
		
	}
		
}




