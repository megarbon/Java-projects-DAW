package secuenciales;

import java.util.Scanner;

public class Sec_19 {
	public static void main(String[] args) {
		int correctas, incorrectas, puntos;
		Scanner sc;
		
		sc = new Scanner(System.in);

		System.out.print("Dime cantidad de respuestas correctas:");
		correctas = Integer.parseInt(sc.nextLine());

		System.out.print("Dime cantidad de respuestas incorrectas:");
		incorrectas = Integer.parseInt(sc.nextLine());

		puntos = correctas * 5 + incorrectas * (-1);
		System.out.print("Puntos: " + puntos);
		
		sc.close();
		
	}
		
}




