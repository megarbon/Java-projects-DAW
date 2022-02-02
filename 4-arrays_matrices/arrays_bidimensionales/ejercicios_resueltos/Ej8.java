
package matrices;

import java.util.*;

public class Ej8 {
	public static void main(String[] args) {
		int NP;
		final int ND = 3;
		// Pedir numero de filas
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce n�mero de personas");
		NP = Integer.parseInt(sc.nextLine());

		String[] nombres = new String[NP];
		String[] ape1 = new String[NP];
		String[] ape2 = new String[NP];

		String[] lista = new String[NP];

		String[][] mat = new String[ND][NP];

		System.out.println("Introducir nombres");
		rellenar(nombres, sc);

		System.out.println("Introducir primeros apellidos");
		rellenar(ape1, sc);

		System.out.println("Introducir segundos apellidos");
		rellenar(ape2, sc);

		/*
		 * escribir(nombres); escribir(ape1); escribir(ape2);
		 */

		rellenarNomCompleto(lista, nombres, ape1, ape2);
		rellenarBidimensional(mat, nombres, ape1, ape2);

		System.out.println("");
		escribir(lista);
		escribir(mat);
	}

	public static void rellenar(String[] matriz, Scanner tecl) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Persona " + (i + 1));
			matriz[i] = tecl.nextLine();
		}
	}

	public static void rellenarNomCompleto(String[] lista, String[] nom, String[] apell1, String[] apell2) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = nom[i] + " " + apell1[i] + " " + apell2[i];
		}
	}

	public static void rellenarBidimensional(String[][] matriz, String[] nom, String[] apell1, String[] apell2) {

		for (int j = 0; j < matriz[0].length; j++) {
			matriz[0][j] = nom[j];
			matriz[1][j] = apell1[j];
			matriz[2][j] = apell2[j];
		}

	}

	public static void escribir(String[] matriz) {
		for (int i = 0; i < matriz.length; i++)
			// System.out.printf("%24s",matriz[i]);
			System.out.format("%24s", matriz[i]);
		System.out.println();
		System.out.println();
	}

	public static void escribir(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				// System.out.printf("%24s", matriz[i][j]);
				System.out.format("%24s", matriz[i][j]);
			System.out.println();
		}
	}

}
